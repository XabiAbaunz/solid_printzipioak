package isp;

	public class SMSSender {
		 public static void sendSMS(SMSInterface c, String message){
		//SMS bat bidaltzen du Person klaseko telefono zenbakira.
			 String phoneNumber  = c.getTelephone();
			 System.out.println(phoneNumber  + "ri " + message +" mezua bidali zaio");
			 }
		}