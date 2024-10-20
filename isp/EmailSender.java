package isp;

public class EmailSender {
	 public static void sendEmail(EmailInterface c, String message){
	// Mezu bat bidaltzen du Person klaseko korreo helbidera. 
		 String email = c.getEmail();
		 System.out.println(email + "-ri " + message +" mezua bidali zaio");
		 }
	}