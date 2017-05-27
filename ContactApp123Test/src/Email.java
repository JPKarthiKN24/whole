

import java.util.HashMap;
import java.util.Map;

public class Email {

	private String Email;
	private String type;
	private Map<String, String> mapMail;

	public Email() {
		// TODO Auto-generated constructor stub
		Email = new String();
		type = new String();
		mapMail = new HashMap<>();
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public Map<String, String> getMapMail() {
		return mapMail;
	}

	public void setMapMail(Map<String, String> mapMail) {
		this.mapMail = mapMail;
	}

	@Override
	public String toString() {
		return "ContactEmail\n\t   EmailID=" + Email + "\n\t    Type=" + type + "\n\t   EMail=" + mapMail + "]";
	}
	

}
