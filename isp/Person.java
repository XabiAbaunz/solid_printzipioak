package isp;

public class Person implements EmailInterface, SMSInterface{
	 String name, address, email, telephone;
	 public void setName(String n) { name=n; }
	 public String getName() { return name; }

	 public void setAddress(String a) { address=a; }
	 public String getAddress() { return address; }

	 public void setEmail (String e) { email=e; }
	 @Override
	 public String getEmail () { return email; }

	 public void setTelephone(String t) { telephone=t; }
	 @Override
	 public String getTelephone() { return telephone; }

	}
