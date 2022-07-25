package com.newt.boot.service.utils.file;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.SftpException;
import com.newt.boot.common.constants.LogDefine;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Vector;

public class SFTPTemplate {
	
	private static final Logger log = LoggerFactory.getLogger(LogDefine.SERVICE_DETAIL);
	
	// 结合springboot
	private SftpPool pool;

	public SFTPTemplate(SftpPool pool) {
		this.pool = pool;
	}

	/**
	 * 将输入流的数据上传到sftp作为文件。文件完整路径=basePath+directory
	 * 
	 * @param basePath
	 *            服务器的基础路径 eg: /upload
	 * @param directory
	 *            上传到该目录 eg: img/ or img/cc/ 一定要带上最后的URL,否则返回的url无效
	 * @param sftpFileName
	 *            sftp端文件名 eg : xx.png
	 * @param input
	 *            输入流
	 */
	public String upload(String basePath, String directory, String sftpFileName, InputStream input) throws Exception {
		ChannelSftp sftp = pool.borrowObject();
		try {
			log.info("start upload file {}", sftpFileName);
			mkdir(basePath, directory, sftp);
			sftp.put(input, sftpFileName); // 上传文件
			log.info("end upload file {}", sftpFileName);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			pool.returnObject(sftp);
		}
		return directory + sftpFileName;
	}
	
	public String upload(String directory, InputStream input,String sftpFileName) throws Exception {
		ChannelSftp sftp = pool.borrowObject();
		try {
			log.info("start upload file {}", sftpFileName);
			boolean dirs = this.createDirs(directory, sftp);
			if (!dirs) {
                log.error("Remote path error. path:{}", directory);
                throw new Exception("Upload File failure");
            }
			//sftp.mkdir(directory);
			sftp.cd(directory);
			sftp.put(input, sftpFileName); // 上传文件
			log.info("end upload file {}", sftpFileName);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			if (sftp.getSession() != null) {
				if (sftp.getSession().isConnected()) {
					sftp.getSession().disconnect();
				}
			}
			//sftp.getSession().disconnect();
			pool.returnObject(sftp);
		}
		return directory + sftpFileName;
	}

	private void mkdir(String basePath, String directory, ChannelSftp sftp) throws SftpException {
		try {
			sftp.cd(basePath);
			sftp.cd(directory);
		} catch (SftpException e) {
			log.info("目录不存在，创建文件夹");
			// 目录不存在，则创建文件夹
			String[] dirs = directory.split("/");
			String tempPath = basePath;
			for (String dir : dirs) {
				if (null == dir || "".equals(dir))
					continue;
				tempPath += "/" + dir;
				try {
					sftp.cd(tempPath);
				} catch (SftpException ex) {
					sftp.mkdir(tempPath);
					sftp.cd(tempPath);
				}
			}
		}
	}
	
	 /**
     * 创建多级目录
     *
     * @param dirPath
     * @param sftp
     * @return
     */
    private boolean createDirs(String dirPath, ChannelSftp sftp) {
        if (dirPath != null && !dirPath.isEmpty() && sftp != null) {
        	// 判断本地目录是否存在，不存在需要新建各级目录
	    	 //String[] dirs = Arrays.stream(dirPath.split("/")).filter(StringUtils::isNotBlank).toArray(String[]::new);
	         //for (String dir : dirs) {
	             try {
	                 sftp.cd(dirPath);
	                 log.info("Change directory {}", dirPath);
	             } catch (Exception e) {
	                 try {
	                     sftp.mkdir(dirPath);
	                     log.info("Create directory {}", dirPath);
	                 } catch (SftpException e1) {
	                     log.error("Create directory failure, directory:{}", dirPath, e1);
	                     e1.printStackTrace();
	                 }
	                 try {
	                     sftp.cd(dirPath);
	                     log.info("Change directory {}", dirPath);
	                 } catch (SftpException e1) {
	                     log.error("Change directory failure, directory:{}", dirPath, e1);
	                     e1.printStackTrace();
	                 }
	             }
	         //}
	         return true;
        }
        return false;
    }


	/**
	 * 下载文件。
	 * 
	 * @param directory
	 *            下载目录
	 * @param downloadFile
	 *            下载的文件
	 * @param saveFile
	 *            存在本地的路径
	 */
	public void download(String directory, String downloadFile, String saveFile) throws Exception {
		ChannelSftp sftp = pool.borrowObject();
		try {
			if (directory != null && !"".equals(directory)) {
				sftp.cd(directory);
			}
			File file = new File(saveFile);
			sftp.get(downloadFile, new FileOutputStream(file));
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			pool.returnObject(sftp);
		}
	}

	/**
	 * 下载文件
	 * 
	 * @param directory
	 *            下载目录
	 * @param downloadFile
	 *            下载的文件名
	 * @return 字节数组
	 */
	public byte[] download(String directory, String downloadFile) throws Exception {
		ChannelSftp sftp = pool.borrowObject();
		try {
			if (directory != null && !"".equals(directory)) {
				sftp.cd(directory);
			}
			InputStream is = sftp.get(downloadFile);
			return IOUtils.toByteArray(is);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			pool.returnObject(sftp);
		}
	}

	/**
	 * 删除文件
	 * 
	 * @param directory
	 *            要删除文件所在目录
	 * @param deleteFile
	 *            要删除的文件
	 */
	public void delete(String directory, String deleteFile) throws Exception {
		ChannelSftp sftp = pool.borrowObject();
		try {
			sftp.cd(directory);
			sftp.rm(deleteFile);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			pool.returnObject(sftp);
		}
	}

	/**
	 * 列出目录下的文件
	 * 
	 * @param directory
	 *            要列出的目录
	 */
	public Vector<?> listFiles(String directory) throws Exception {
		ChannelSftp sftp = pool.borrowObject();
		try {
			return sftp.ls(directory);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			pool.returnObject(sftp);
		}
	}
	
	
}