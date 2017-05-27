package contactlist;

public class Contact {

	private String name;
	private String numberType;
	private String number;
	private String emailId;
	private String address;
	
	ContactName c1=new ContactName();
	ContactNumber c2=new ContactNumber();
	ContactEmail c3=new ContactEmail();
	ContactAddress c4=new ContactAddress();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		c1.setName(name);
		
	}
	public String getNumberType() {
		return numberType;
	}
	public void setNumberType(String numberType) {
		this.numberType = numberType;
		c2.setNumber(numberType);
		
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
