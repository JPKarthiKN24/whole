

import java.util.HashMap;
import java.util.Map;

public class Mobile {

	private Long mobilenumber;
	private String type;
	private Map<Long, String> mobileno;

	public Mobile() {

		mobilenumber = new Long(0);
		type = new String();
		mobileno = new HashMap<>();

	}

	public Long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public Map<Long, String> getMobileno() {
		return mobileno;
	}

	public void setMobileno(Map<Long, String> mobileno) {
		this.mobileno = mobileno;
	}
	

	@Override
	public String toString() {
		return "ContactMobile\n\t   mobilenumber -> " + mobilenumber + "\n\t   Type -> " + type + "\n\t   mobileno -> " + mobileno + "";
	}
	
	

}
