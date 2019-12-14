package com.in28minutes.res.webservices.restfulwebservices.exception;

import java.util.Date;

public class ExceptionResponse {
	//timestamp
		private Date timestamp;
	//message
		private String message;
	//detail
		private String details;
		
		private String prueba;
		
		public ExceptionResponse(Date timestamp, String message, String details, String prueba) {
			super();
			this.timestamp = timestamp;
			this.message = message;
			this.details = details;
			this.prueba = prueba;
		}

		public String getPrueba() {
			return prueba;
		}

		public Date getTimestamp() {
			return timestamp;
		}

		public String getMessage() {
			return message;
		}

		public String getDetails() {
			return details;
		}
				
		
		
		
}
