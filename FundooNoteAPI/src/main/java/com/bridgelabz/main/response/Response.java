package com.bridgelabz.main.response;

public class Response {
	private String statusCode;
	private String msg;
	private String token;

	public Response() {
		// TODO Auto-generated constructor stub
	}

	public Response(String statusCode, String msg,String token) {
		super();
		this.statusCode = statusCode;
		this.msg = msg;
		this.token = token;
	}
	public Response(String statusCode, String msg) {
		super();
		this.statusCode = statusCode;
		this.msg = msg;
		
	}


	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
