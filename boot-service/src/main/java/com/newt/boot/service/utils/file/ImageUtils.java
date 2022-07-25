package com.newt.boot.service.utils.file;


import com.newt.boot.common.constants.CommonConstant;
import com.newt.boot.service.utils.MchsAppConfig;
import net.coobird.thumbnailator.Thumbnails;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.util.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;

/**
 * 图片处理工具类
 *
 * @author 新大陆金融
 */
public class ImageUtils {
    private static final Logger log = LoggerFactory.getLogger(ImageUtils.class);

    public static byte[] getImage(String imagePath) {
        InputStream is = getFile(imagePath);
        try {
            return IOUtils.toByteArray(is);
        } catch (Exception e) {
            log.error("图片加载异常 {}", e);
            return null;
        } finally {
            IOUtils.closeQuietly(is);
        }
    }

    public static InputStream getFile(String imagePath) {
        try {
            byte[] result = readFile(imagePath);
            result = Arrays.copyOf(result, result.length);
            return new ByteArrayInputStream(result);
        } catch (Exception e) {
            log.error("获取图片异常 {}", e);
        }
        return null;
    }

    /**
     * 读取文件为字节数据
     *
     * @param key 地址
     * @return 字节数据
     */
    public static byte[] readFile(String url) {
        InputStream in = null;
        try {
            if (url.startsWith("http")) {
                // 网络地址
                URL urlObj = new URL(url);
                URLConnection urlConnection = urlObj.openConnection();
                urlConnection.setConnectTimeout(30 * 1000);
                urlConnection.setReadTimeout(60 * 1000);
                urlConnection.setDoInput(true);
                in = urlConnection.getInputStream();
            } else {
                // 本机地址
                String localPath = MchsAppConfig.getProfile();
                String downloadPath = localPath + StringUtils.substringAfter(url, CommonConstant.RESOURCE_PREFIX);
                in = new FileInputStream(downloadPath);
            }
            return IOUtils.toByteArray(in);
        } catch (Exception e) {
            log.error("获取文件路径异常 {}", e);
            return null;
        } finally {
            IOUtils.closeQuietly(in);
        }
    }
    
    
    /**
     * [压缩要上传的文件，并将文件类型转为指定的文件类型集合中的一个。]
     *
     * @param file         要上传的文件
     * @param absolutePath 临时文件的绝对路径
     * @param fileTypeList 文件转成的类型集合
     * @return
     */
	public static MultipartFile compressFile(MultipartFile file, String absolutePath, List<String> fileTypeList) throws IOException {
		//记录原MultipartFile，如果压缩异常就用原来的MultipartFile
		MultipartFile oldMultipartFile = file;
		FileInputStream fileInputStream = null;
		try {
			String fileName = file.getName();
			String originalFilename = file.getOriginalFilename();
			String contentType = file.getContentType();
			// 获取要上传的文件后缀
			String fileExt = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
			File tempFile = new File(absolutePath);
			if (fileTypeList.contains(fileExt)) {
				// 如果文件类型符合，则只压缩就好了
				Thumbnails.of(file.getInputStream()).scale(1f).outputQuality(0.25f).toFile(tempFile);
			} else {
				// 如果文件类型不在指定的集合内。则要转格式，并压缩
				Thumbnails.of(file.getInputStream()).scale(1f).outputFormat(fileTypeList.get(0)).outputQuality(0.25f).toFile(tempFile);
				originalFilename = originalFilename.replace("." + fileExt, "." + fileTypeList.get(0));
			}
			fileInputStream = new FileInputStream(tempFile);
			file = new MockMultipartFile(fileName, originalFilename, contentType, fileInputStream);
			boolean success = tempFile.delete();
			log.info("删除临时file success：{}", success);
		} catch (IOException e) {
			log.error("压缩图片失败,把MultipartFile赋值为原来的值oldFile,exception：{}", e);
			file = oldMultipartFile;
		} finally {
			fileInputStream.close();
		}
		return file;
	}
    
    
    
}
