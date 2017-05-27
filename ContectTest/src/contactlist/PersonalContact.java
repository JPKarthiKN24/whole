
	package contactlist;
	 
    public class PersonalContact extends Contact {
 
    private String dateOfBirth;
        
    public PersonalContact(String firstName, String lastName, String address, String email, String phone, String dateOfBirth) {
        super(firstName, lastName, address, email, phone);
        this.dateOfBirth = dateOfBirth;
    }
 
    public String getdateOfBirth() {
        return dateOfBirth;
    }
 
    public void setdateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
 
    void write() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString()
    {
    	return String.format("First name: %s%nLast name: %s%nPhone Number: %s%nemail: %s%nAddress: %s", firstName, lastName, phone, email, address);  /** etc **/
    }
     



}
