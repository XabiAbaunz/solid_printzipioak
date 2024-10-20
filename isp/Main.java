package isp;

public class Main {
    public static void main(String[] args) {
        GmailAccount gmailAccount = new GmailAccount("Alaitz", "alaitz.com");

        EmailSender.sendEmail(gmailAccount, "Kaixo Alice, gmailaren proba bat da hau!");

    }
}