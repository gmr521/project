package project1.java;


	public class AgeInvalidException extends Exception {
		String msg1;
		AgeInvalidException(String msg){
			super();
			this.msg1=msg;
			
		}
		public String getMessage() {
			
			return msg1;
		}
		

	}


