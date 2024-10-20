package isp;

public class GmailAccount implements EmailInterface {
    String name;
    String emailAddress;
    
    public GmailAccount(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }
    
    @Override
    public String getEmail() {
        return emailAddress;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
