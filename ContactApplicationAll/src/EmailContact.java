
public class EmailContact {
	
	private String email;
	private String emailType;

	public String getEmailType() {
		return emailType;
	}

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString(){
		return "EmailID="+email+"\nEmailType="+emailType;
	}
}
