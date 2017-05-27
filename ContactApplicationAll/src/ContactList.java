
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
//import java.util.List;
import java.util.Map;

public class ContactList {

	private NameContact nameList;
	// private Map
	private Map<String, LinkedHashSet<String>> phoneNumberList = new HashMap<String, LinkedHashSet<String>>();
	private Map<String, LinkedHashSet<String>> emailList = new HashMap<String, LinkedHashSet<String>>();

	public NameContact getNameList() {
		return nameList;
	}

	public void setNameList(NameContact nameContact) {
		nameList=new NameContact();
		this.nameList = nameContact;
	}

	public Map<String, LinkedHashSet<String>> getPhoneNumberList() {
		return phoneNumberList;
	}

	public void setPhoneNumberList(phoneContact phoneContact) {

		//phoneContact pc = new phoneContact();

		Map<String, LinkedHashSet<String>> pn = new HashMap<String, LinkedHashSet<String>>();
		// LinkedHashSet<String> ps= new LinkedHashSet<>();
		// ps.add(pc.getPhoneNumber());
		pn.put(phoneContact.getPhoneNumberType(), new LinkedHashSet<>());
		pn.get(phoneContact.getPhoneNumberType()).add(phoneContact.getPhoneNumber());
		phoneNumberList = pn;

		// this.phoneNumberList = (Map<String, LinkedHashSet<String>>)
		// phoneContact;
	}

	public Map<String, LinkedHashSet<String>> getEmailList() {
		return emailList;
	}

	public void setEmailList(EmailContact emailContact) {

		//EmailContact ec = new EmailContact();

		Map<String, LinkedHashSet<String>> em = new HashMap<String, LinkedHashSet<String>>();
		// LinkedHashSet<String> ps= new LinkedHashSet<>();
		// ps.add(ec.getEmail());
		em.put(emailContact.getEmailType(), new LinkedHashSet<>());
		em.get(emailContact.getEmailType()).add(emailContact.getEmail());
		emailList = em;

		// this.emailList = (Map<String, LinkedHashSet<String>>) emailContact;
	}

	@Override
	public String toString() {
		return   nameList + ", phoneNumberList=" + phoneNumberList + ", emailList=" + emailList;
	}

}
