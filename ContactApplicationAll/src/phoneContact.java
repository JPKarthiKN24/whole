
public class phoneContact {

	private String phoneNumber;
	private String phoneNumberType;

	public String getPhoneNumberType() {
		return phoneNumberType;
	}

	public void setPhoneNumberType(String phoneNumberType) {
		this.phoneNumberType = phoneNumberType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String toString(){
		
		return "PhoneNumber="+phoneNumber+"\nPhoneType="+phoneNumberType;
	}
	
	
}
