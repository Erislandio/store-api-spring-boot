package com.erislandio.cursomc.resources.exceptions;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

public class StandardError implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private HttpStatus status;
	private String msg;
	private Long timestamp;
	
	public StandardError(HttpStatus notFound, String msg, Long timestamp) {
		super();
		this.status = notFound;
		this.msg = msg;
		this.timestamp = timestamp;
	}

	
	public HttpStatus getStatus() {
		return status;
	}


	public void setStatus(HttpStatus status) {
		this.status = status;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
}
