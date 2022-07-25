package com.newt.boot.service.config;
import org.apache.commons.net.ftp.FTP;
import org.springframework.stereotype.Component;

/**
 * FTP的配置信息
 * @Description:
 */
@Component
//@PropertySource("classpath:ftp.properties")
//@ConfigurationProperties(prefix = "ftp")
public class FTPProperties {
	
	private String username;
	private String password;
	private String host;
	private Integer port;
	private String baseUrl;
	private Integer passiveMode = FTP.BINARY_FILE_TYPE;
	private String encoding="UTF-8";
	private int clientTimeout=120000;
	private int bufferSize;
	private int transferFileType=FTP.BINARY_FILE_TYPE;
	private boolean renameUploaded;
	private int retryTime;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	public Integer getPassiveMode() {
		return passiveMode;
	}
	public void setPassiveMode(Integer passiveMode) {
		this.passiveMode = passiveMode;
	}
	public String getEncoding() {
		return encoding;
	}
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	public int getClientTimeout() {
		return clientTimeout;
	}
	public void setClientTimeout(int clientTimeout) {
		this.clientTimeout = clientTimeout;
	}
	public int getBufferSize() {
		return bufferSize;
	}
	public void setBufferSize(int bufferSize) {
		this.bufferSize = bufferSize;
	}
	public int getTransferFileType() {
		return transferFileType;
	}
	public void setTransferFileType(int transferFileType) {
		this.transferFileType = transferFileType;
	}
	public boolean isRenameUploaded() {
		return renameUploaded;
	}
	public void setRenameUploaded(boolean renameUploaded) {
		this.renameUploaded = renameUploaded;
	}
	public int getRetryTime() {
		return retryTime;
	}
	public void setRetryTime(int retryTime) {
		this.retryTime = retryTime;
	}
	
	@Override
	public String toString() {
		return "FTPProperties [username=" + username + ", password=" + password + ", host=" + host + ", port=" + port
				+ ", baseUrl=" + baseUrl + ", passiveMode=" + passiveMode + ", encoding=" + encoding
				+ ", clientTimeout=" + clientTimeout + ", bufferSize=" + bufferSize + ", transferFileType="
				+ transferFileType + ", renameUploaded=" + renameUploaded + ", retryTime=" + retryTime + "]";
	}
}