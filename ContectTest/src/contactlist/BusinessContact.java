
	package contactlist;
	 
    public class BusinessContact extends Contact {
 
    private String jobTitle;
    private String organization;
 
    public BusinessContact(String firstName, String lastName, String address, String email, String phone, String jobTitle, String organization) {
        super(firstName, lastName, address, email, phone);
        this.jobTitle = jobTitle;
        this.organization = organization;
    }
 
    public String getJobTitle() {
        return jobTitle;
    }
 
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
 
    public String getOrganization() {
        return organization;
    }
 
    public void setOrganization(String organization) {
        this.organization = organization;
    }
 
    void write() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString()
    {
    	return String.format("First name: %s%nLast name: %s%nPhone Number: %s%nemail: %s%nAddress: %s", firstName, lastName, phone, email, address);  /** etc **/
    }
 

 

}