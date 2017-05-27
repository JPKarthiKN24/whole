package contactlist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ContactNumber{
	
	private String number;
	private Set<String> numberName;
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Set<String> getNumberName() {
		return numberName;
	}

	public void setNumberName(Set<String> numberName) {
		this.numberName = numberName;
	}

	
	
	public ContactNumber(String number, Set<String> numberName) {
		
	}

	public void write() {
		 throw new UnsupportedOperationException("Not supported yet.");
		
	}

	
	

}
