package com.example.demo;

public class Response {
		int statusCode;
		String message;
		String response;
		
		public Response() {}
		
		public Response(int statusCode, String message, String response) {
			super();
			this.statusCode = statusCode;
			this.message = message;
			this.response = response;
		}
		public int getStatusCode() {
			return statusCode;
		}
		public void setStatusCode(int statusCode) {
			this.statusCode = statusCode;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getResponse() {
			return response;
		}
		public void setResponse(String response) {
			this.response = response;
		}
		
		
		
}
