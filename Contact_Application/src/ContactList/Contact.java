package ContactList;

public class Contact {

	private String name;
	private MobileNumber mobile;
	private UserMail Email;
    private UserAddress address;
    private UserDOB dob;

	public Contact() {
		// TODO Auto-generated constructor stub
		mobile = new MobileNumber();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MobileNumber getMobile() {
		return mobile;
	}

	public void setMobile(MobileNumber mobile) {
		this.mobile = mobile;
	}

	public UserMail getEmail() {
		return Email;
	}

	public void setEmail(UserMail email) {
		Email = email;
	}
	
	 public UserAddress getAddress() {
	 return address;
	 }
	
	 public UserDOB getDob() {
		return dob;
	}

	public void setDob(UserDOB dob) {
		this.dob = dob;
	}

	public void setAddress(UserAddress address) {
	 this.address = address;
	 }
	 

	@Override
	public String toString() {
		return "\t\tContact Application\n" + name + "\n mobile=" + mobile + "\n Email=" + Email + "\n address=" + address ;
	}




	

}
