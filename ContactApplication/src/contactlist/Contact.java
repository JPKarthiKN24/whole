package contactlist;

import java.util.Set;

public class Contact {
	
	protected String firstName;
    protected String lastName;
    protected String address;
    protected String email;
    protected String phone;
    protected String number;
    protected Set<String> numberName;
    
	public Contact(String number, Set<String> numberName) {
		this.number=number;
		this.numberName=numberName;
	}

}
