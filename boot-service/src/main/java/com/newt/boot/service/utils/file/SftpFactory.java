package com.newt.boot.service.utils.file;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.newt.boot.service.config.SftpProperties;
import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import java.util.Properties;

public class SftpFactory extends BasePooledObjectFactory<ChannelSftp> {

	private SftpProperties properties;

	public SftpFactory(SftpProperties properties) {
		this.properties = properties;
	}

	@Override
	public ChannelSftp create() throws Exception {
		try {
			JSch jsch = new JSch();
			Session sshSession = jsch.getSession(properties.getUsername(), properties.getHost(), properties.getPort());
			sshSession.setPassword(properties.getPassword());
			Properties sshConfig = new Properties();
			sshConfig.put("StrictHostKeyChecking", "no");
			sshSession.setConfig(sshConfig);
			sshSession.connect();
			ChannelSftp channel = (ChannelSftp) sshSession.openChannel("sftp");
			channel.connect();
			return channel;
		} catch (JSchException e) {
			throw new Exception("连接sfpt失败", e);
		}
	}

	@Override
	public PooledObject<ChannelSftp> wrap(ChannelSftp channelSftp) {
		return new DefaultPooledObject<>(channelSftp);
	}

	// 销毁对象
	@Override
	public void destroyObject(PooledObject<ChannelSftp> p) {
		ChannelSftp channelSftp = p.getObject();
		channelSftp.disconnect();
	}

	public SftpProperties getProperties() {
		return properties;
	}

	public void setProperties(SftpProperties properties) {
		this.properties = properties;
	}
	
	
	

}