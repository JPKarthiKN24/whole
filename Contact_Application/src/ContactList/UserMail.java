package ContactList;

import java.util.HashMap;
import java.util.Map;

public class UserMail {
	private String UserMail;
	private String type;
	private Map<String, String> mapMail;

	public UserMail() {
		// TODO Auto-generated constructor stub
		UserMail = new String();
		type = new String();
		mapMail = new HashMap<>();
	}

	public String getEmail() {
		return UserMail;
	}

	public void setEmail(String email) {
		this.UserMail = email;
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
		return "ContactEmail\n\t   EmailID=" + UserMail + "\n\t    Type=" + type + "\n\t   EMail=" + mapMail + "]";
	}

}
