package com.newt.boot.service.utils.sftpclient;

import com.jcraft.jsch.*;
import com.newt.boot.common.exception.SftpClientException;
import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import java.util.Properties;

/**
 * sftp工厂
 *
 * @author 刘子良
 */
public class SftpFactory extends BasePooledObjectFactory<Sftp> {

    private static final String CHANNEL_TYPE = "sftp";
    private static Properties sshConfig = new Properties();
    private String host;
    private int port;
    private String username;
    private String password;

    static {
        sshConfig.put("StrictHostKeyChecking", "no");
    }
    
    
    
    
    
    

    public SftpFactory() {
		super();
	}

	public SftpFactory(String host, int port, String username, String password) {
		super();
		this.host = host;
		this.port = port;
		this.username = username;
		this.password = password;
	}
	
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((host == null) ? 0 : host.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + port;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SftpFactory other = (SftpFactory) obj;
		if (host == null) {
			if (other.host != null)
				return false;
		} else if (!host.equals(other.host))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (port != other.port)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	/**
     * 创建一个{@link Sftp}实例
     * 这个方法必须支持并发多线程调用
     *
     * @return {@link Sftp}实例
     */
    @Override
    public Sftp create() {
        try {
            JSch jsch = new JSch();
            Session sshSession = jsch.getSession(username, host, port);
            sshSession.setPassword(password);
            sshSession.setConfig(sshConfig);
            sshSession.connect();
            ChannelSftp channel = (ChannelSftp) sshSession.openChannel(CHANNEL_TYPE);
            channel.connect();
            return new Sftp(channel);
        } catch (JSchException e) {
            throw new SftpClientException("连接sftp失败", e);
        }
    }

    /**
     * 用{@link PooledObject}的实例包装对象
     *
     * @param sftp 被包装的对象
     * @return 对象包装器
     */
    @Override
    public PooledObject<Sftp> wrap(Sftp sftp) {
        return new DefaultPooledObject<>(sftp);
    }

    /**
     * 销毁对象
     *
     * @param p 对象包装器
     */
    @Override
    public void destroyObject(PooledObject<Sftp> p) {
        if (p!=null) {
            Sftp sftp = p.getObject();
            if (sftp!=null) {
                ChannelSftp channelSftp = sftp.getChannelSftp();
                if (channelSftp!=null) {
                    channelSftp.disconnect();
                }
            }
        }
    }

    /**
     * 检查连接是否可用
     *
     * @param p 对象包装器
     * @return {@code true} 可用，{@code false} 不可用
     */
    @Override
    public boolean validateObject(PooledObject<Sftp> p) {
        if (p!=null) {
            Sftp sftp = p.getObject();
            if (sftp!=null) {
                try {
                    sftp.getChannelSftp().cd("./");
                    return true;
                } catch (SftpException e) {
                    return false;
                }
            }
        }
        return false;
    }

    public static class Builder {
        private String host;
        private int port;
        private String username;
        private String password;
        public SftpFactory build() {
            return new SftpFactory(host, port, username, password);
        }
        public Builder host(String host) {
            this.host = host;
            return this;
        }
        public Builder port(int port) {
            this.port = port;
            return this;
        }
        public Builder username(String username) {
            this.username = username;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }
    }
}
