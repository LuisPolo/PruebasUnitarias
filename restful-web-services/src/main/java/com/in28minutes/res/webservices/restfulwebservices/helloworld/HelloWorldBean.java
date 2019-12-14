package com.in28minutes.res.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

	
		private String message;
		private String nombre;

		public HelloWorldBean(String message) {
			
			this. message = message;
			this.nombre = "Luis polo martinez";
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		@Override
		public String toString() {
			
			return "HelloWorldBean [message=" + message + "]";
		}
		
		
}
