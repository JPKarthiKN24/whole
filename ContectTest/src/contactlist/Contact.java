
	package contactlist;
	 
    public class Contact {
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String email;
    protected String phone;
 
    public Contact(String firstName, String lastName, String address, String email, String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }
 
    public String getfirstName() {
        return this.firstName;
    }
 
    public String setfirstName(String firstName){
        String string = this.firstName = firstName;
		return string;
    }
 
    public String getlastName() {
        return this.lastName;
    }
 
    public String setlastName(String lastName){
        String string = this.lastName = lastName;
		return string;
    }
 
    public String getAddress() {
        return this.address;
    }
 
    public String setAddress(String address){
        String string = this.address = address;
		return string;
    }
 
    public String getEmail() {
        return this.email;
    }
 
    public String setEmail(String email){
        String string = this.email = email;
		return string;
    }
 
    public String getPhone() {
        return this.phone;
    }
 
    public String setPhone(String phone){
        String string = this.phone = phone;
		return string;
    }
 
    String getFirstName() {
        return firstName;
    }
 
    String getLastName() {
        return lastName;
    }
 
public void viewContacts() {
System.out.println(this.getfirstName());
System.out.println(this.getlastName());
System.out.println(this.getAddress());
System.out.println(this.getEmail());
System.out.println(this.getPhone());
}
 


}
