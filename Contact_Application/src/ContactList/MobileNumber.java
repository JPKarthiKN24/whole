package ContactList;

import java.util.HashMap;
import java.util.Map;

public class MobileNumber {
	private String MobileNumber;
	private String type;
	private Map<String, String> mobile;

	public MobileNumber() {
		// TODO Auto-generated constructor stub
		MobileNumber = new String();
		type = new String();
		mobile = new HashMap<>();
	}

	public String getEmail() {
		return MobileNumber;
	}

	public void setMobileNumber(String MobileNumber) {
		this.MobileNumber = MobileNumber;
	}

	public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public Map<String, String> getMapmobile() {
		return mobile;
	}

	public void setMapMail(Map<String, String> getMapmobile) {
		this.mobile = getMapmobile;
	}

	@Override
	public String toString() {
		return "ContactMobile\n\t   mobilenumber=" + MobileNumber + "\n\t    Type=" + type + "\n\t   Mobileno=" + mobile
				+ "]";
	}

}
