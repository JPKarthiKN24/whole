package ContactList;

public class Contact {
	private String Name;
	private String numberType;
	private String number;
	private String email;
	ContactName cn1=new ContactName();
	ContactNumberType cn2=new ContactNumberType();
	ContactNumber cn3=new ContactNumber();
	ContactEmailId cn4=new ContactEmailId();
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
		cn1.setName(name);
	}
	public String getNumberType() {
		return numberType;
	}
	public void setNumberType(String numberType) {
		this.numberType = numberType;
		cn2.setNumberType(numberType);
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
		cn3.setNumber(number);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		cn4.setEmail(email);
	}
	
}
