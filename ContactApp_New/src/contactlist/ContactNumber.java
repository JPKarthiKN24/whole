package contactlist;

import java.util.HashMap;
import java.util.Map;

public class ContactNumber {
	
	Map<String,String> m1=new HashMap<String,String>();
	
	private String number;
	private String numberType;

	public String getNumberType() {
		return numberType;
	}

	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public void contactNumber(){
		
		m1.entry(number,numberType);
		
	}
	
	

}
