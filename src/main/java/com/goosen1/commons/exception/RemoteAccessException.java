package com.goosen1.commons.exception;


import com.goosen1.commons.enums.ResultCode;

/**
 * 远程访问异常
 * @author Goosen
 * @since 2018-05-31 pm
 */
public class RemoteAccessException extends BusinessException {

	private static final long serialVersionUID = -832464574076215195L;

	public RemoteAccessException() {
		super();
	}

	public RemoteAccessException(Object data) {
		super.data = data;
	}

	public RemoteAccessException(ResultCode resultCode) {
		super(resultCode);
	}

	public RemoteAccessException(ResultCode resultCode, Object data) {
		super(resultCode, data);
	}

	public RemoteAccessException(String msg) {
		super(msg);
	}

	public RemoteAccessException(String formatMsg, Object... objects) {
		super(formatMsg, objects);
	}

}
