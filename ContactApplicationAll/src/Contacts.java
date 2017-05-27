
import java.util.ArrayList;

public class Contacts {
   ArrayList<ContactList> list=new ArrayList<>();
  // ContactList cl=new ContactList();
	public void setName() {
		// TODO Auto-generated method stub
		
	}

	public void addContact(ContactList cl) {
		list.add(cl);
		
	}
	
	public ContactList getContact(int index) {
		return list.get(index);
	}

	public void getContact() {
		
		for (ContactList number : list) {
			   System.out.println(number);
			   } 
	}

	public int getLength() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public  String toString(){
		 
		return "ContactApplication="+list;
		
	}

	public Object updateContact() {
		// TODO Auto-generated method stub
		return null;
	}

	public NameContact getSearchContact(String nameSearch, ContactList cl) {
		NameContact cl1=null;
    if(nameSearch.equals(cl.getNameList())){
    	cl1= cl.getNameList();}
		  return cl1;
		   
	}
	

}
