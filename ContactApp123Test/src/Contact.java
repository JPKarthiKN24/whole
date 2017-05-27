

public class Contact {

	private Name name;
	private Mobile mobile;
	private Email Email;
    private Address address;

	public Contact() {
		// TODO Auto-generated constructor stub
		mobile = new Mobile();
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public Email getEmail() {
		return Email;
	}

	public void setEmail(Email email) {
		Email = email;
	}
	
	 public Address getAddress() {
	 return address;
	 }
	
	 public void setAddress(Address address) {
	 this.address = address;
	 }

	@Override
	public String toString() {
		return "\t\tContact Application\n" + name + "\n mobile=" + mobile + "\n Email=" + Email + "\n address=" + address + "";
	}

	

}
