package com.newt.boot.common.utils;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/**
 * 简述：pdf工具类 <br>
 * 详细描述：<br>
 *1.通过html生成pdf 用于协议生成 <br>
 */
public class PdfUtils extends BaseUtils {
    private static final Logger log = LoggerFactory.getLogger(PdfUtils.class);

    /**
     * html文件转换成pdf
     * 1.必须保证有 body标签
     * 2.必须保证所有标签是闭合的，即必须是成对的
     * 3.原始html文件必须是utf-8格式的
     * @param htmlFilePath 需要转换的html路径  绝对地址，并且包含文件名称 ； 注意：html请用utf-8编码，否则中文会乱码
     * @param pdfFilePath 需要生成的pdf文件路径 绝对地址，并且包含文件名称 ；，注意：路径指向的文件如果存在会直接替换原文件内容
     */
    public static void html2pdfByFile(String htmlFilePath, String pdfFilePath) {
        if (isNull(htmlFilePath))
            return;
        if (isNull(pdfFilePath))
            return;
        File f = new File(htmlFilePath);
        if (!f.exists())
            return;
        Charset charset = Charset.forName("UTF-8");
        InputStream in = null;
        try {
            in = new FileInputStream(htmlFilePath);
            html2pdf(in, pdfFilePath, charset);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * html文件内容转换成pdf
     * 1.必须保证有 body标签
     * 2.必须保证所有标签是闭合的，即必须是成对的
     * 3.原始html文件必须是utf-8格式的
     * @param htmlFilePath 需要转换的html内容； 注意：html请用utf-8编码，否则中文会乱码
     * @param pdfFilePath 需要生成的pdf文件路径 绝对地址，并且包含文件名称 ；，注意：路径指向的文件如果存在会直接替换原文件内容
     */
    public static void html2pdfByContents(String htmlContents, String pdfFilePath) {
        if (isNull(htmlContents))
            return;
        if (isNull(pdfFilePath))
            return;
        Charset charset = Charset.forName("UTF-8");
        InputStream in = new ByteArrayInputStream(htmlContents.getBytes(charset));
        html2pdf(in, pdfFilePath, charset);
    }

    /**
     * html文件内容转换成pdf
     * 1.必须保证有 body标签
     * 2.必须保证所有标签是闭合的，即必须是成对的
     * 3.原始html文件必须是utf-8格式的
     * @param htmlFilePath 需要转换的html内容； 注意：html请用utf-8编码，否则中文会乱码
     * @param pdfFilePath 需要生成的pdf文件路径 绝对地址，并且包含文件名称 ；，注意：路径指向的文件如果存在会直接替换原文件内容
     */
    public static ByteArrayOutputStream html2pdfByContents(String htmlContents) {
        if (isNull(htmlContents))
            return null;
        Charset charset = Charset.forName("UTF-8");
        InputStream in = new ByteArrayInputStream(htmlContents.getBytes(charset));
        return html2pdf(in, charset);
    }

    /**
     * html文件内容转换成pdf 
     * 1.必须保证有 body标签 
     * 2.必须保证所有标签是闭合的，即必须是成对的 
     * 3.原始html文件必须是utf-8格式的
     * @param htmlFilePath 需要转换的html路径 绝对地址，并且包含文件名称 ； 注意：html请用utf-8编码，否则中文会乱码
     * @param pdfFilePath 需要生成的pdf文件路径 绝对地址，并且包含文件名称 ；，注意：路径指向的文件如果存在会直接替换原文件内容
     */
    private static void html2pdf(InputStream in, String pdfFilePath, Charset charset) {
        Document doc = null;
        PdfWriter writer = null;
        try {
            File f = new File(pdfFilePath);
            if (!f.getParentFile().exists()) {//创建父目录
                f.getParentFile().mkdirs();
            }
            doc = new Document();
            writer = PdfWriter.getInstance(doc, new FileOutputStream(pdfFilePath));
            doc.open();
            log.info("====html2pdf ====beg====");
            XMLWorkerHelper.getInstance().parseXHtml(writer, doc, in, charset);
            log.info("====html2pdf ====end====pdfpath =[" + pdfFilePath + "]");
        } catch (DocumentException e) {
            e.printStackTrace();
            log.error("com.newland.receipt.mchs.common.utils.PdfUtils.html2pdf-DocumentException异常:{}",e);
        } catch (IOException e) {
            e.printStackTrace();
            log.error("com.newland.receipt.mchs.common.utils.PdfUtils.html2pdf异常-IOException:{}",e);
        } finally {
            try {
                if (doc != null)
                    doc.close();
                if (writer != null)
                    writer.close();
                if (in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
                log.error("com.newland.receipt.mchs.common.utils.PdfUtils.html2pdf(IOException)异常:{}",e);
            }
        }
    }

    /**
     * html文件内容转换成pdf 
     * 1.必须保证有 body标签 
     * 2.必须保证所有标签是闭合的，即必须是成对的 
     * 3.原始html文件必须是utf-8格式的
     * @param htmlFilePath 需要转换的html路径 绝对地址，并且包含文件名称 ； 注意：html请用utf-8编码，否则中文会乱码
     * @param pdfFilePath 需要生成的pdf文件路径 绝对地址，并且包含文件名称 ；，注意：路径指向的文件如果存在会直接替换原文件内容
     */
    private static ByteArrayOutputStream html2pdf(InputStream in, Charset charset) {
        Document doc = null;
        PdfWriter writer = null;
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        try {
            doc = new Document();
            writer = PdfWriter.getInstance(doc, outStream);
            doc.open();
            log.info("====html2pdf ====beg====");
            XMLWorkerHelper.getInstance().parseXHtml(writer, doc, in, charset);
            log.info("====html2pdf ====end====");
            return outStream;
        } catch (DocumentException e) {
            e.printStackTrace();
            log.error("com.newland.receipt.mchs.common.utils.PdfUtils.html2pdf-DocumentException异常:{}",e);
        } catch (IOException e) {
            e.printStackTrace();
            log.error("com.newland.receipt.mchs.common.utils.PdfUtils.html2pdf-IOException异常:{}",e);
        } finally {
            try {
                if (doc != null)
                    doc.close();
                if (writer != null)
                    writer.close();
                if (in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
                log.error("com.newland.receipt.mchs.common.utils.PdfUtils.html2pdf(IOException)异常:{}",e);
            }
        }
        return null;
    }

    /**
     * 文件字节流转换为base64字符
     *
     * @param ins
     * @return
     */
    public static String pdfToBase64(InputStream ins) {
        Base64 encoder = new Base64();
        BufferedInputStream bin = null;
        ByteArrayOutputStream baos = null;
        BufferedOutputStream bout = null;
        try {
            bin = new BufferedInputStream(ins);
            baos = new ByteArrayOutputStream();
            bout = new BufferedOutputStream(baos);
            byte[] buffer = new byte[1024];
            int len = bin.read(buffer);
            while (len != -1) {
                bout.write(buffer, 0, len);
                len = bin.read(buffer);
            }
            //刷新此输出流并强制写出所有缓冲的输出字节
            bout.flush();
            byte[] bytes = baos.toByteArray();
            String pdfBase64 = new String(encoder.encode(bytes)).trim();
            pdfBase64.replaceAll("\r\n", "");//替换图片流中的换行和空格
            pdfBase64.replaceAll("\\+", "%2B");//对base64的"+"进行转义
            return pdfBase64;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bin.close();
                bout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public final static String MD5(String s) {
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("MD5 encryption algorithm implementation error", e);
            return null;
        }
    }
}
