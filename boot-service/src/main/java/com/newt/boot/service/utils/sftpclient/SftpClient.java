package com.newt.boot.service.utils.sftpclient;

import com.newt.boot.common.exception.SftpClientException;

/**
 * @author 刘子良
 */
public class SftpClient implements ISftpClient {

    private SftpPool sftpPool;

    /**
     * 从sftp连接池获取连接并执行操作
     *
     * @param handler sftp操作
     */
    @Override
    public void open(Handler handler) {
        Sftp sftp = null;
        try {
            sftp = sftpPool.borrowObject();
            Handler policyHandler = new DelegateHandler(handler);
            policyHandler.doHandle(sftp);
        } catch (SftpClientException e) {
            throw e;
        } catch (Exception e) {
            throw new SftpClientException("获取sftp连接出错！", e);
        } finally {
            if (sftp != null) {
                sftpPool.returnObject(sftp);
            }
        }
    }

    //@AllArgsConstructor
    static class DelegateHandler implements Handler {

        private Handler target;

        @Override
        public void doHandle(Sftp sftp) {
            try {
                target.doHandle(sftp);
            } catch (Exception e) {
                // 捕获sftp操作的所有异常，包装成SftpClientException
                throw new SftpClientException("执行sftp操作出错！", e);
            }
        }

		public DelegateHandler(Handler target) {
			super();
			this.target = target;
		}

		public DelegateHandler() {
			super();
		}
        
        
    }

	public SftpPool getSftpPool() {
		return sftpPool;
	}

	public void setSftpPool(SftpPool sftpPool) {
		this.sftpPool = sftpPool;
	}

	public SftpClient(SftpPool sftpPool) {
		super();
		this.sftpPool = sftpPool;
	}

	public SftpClient() {
		super();
	}

}
