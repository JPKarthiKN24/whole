import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

public class ContactMain implements Comparable<ContactMain>  {

	private ContactPojo nameList;

	private Map<String, LinkedHashSet<String>> numberlist = new HashMap<String, LinkedHashSet<String>>();
	private Map<String, LinkedHashSet<String>> emaillist = new HashMap<String, LinkedHashSet<String>>();

	public ContactPojo getNameList() {
		return nameList;
	}

	public void setNameList(ContactPojo namePojo) {
		this.nameList = namePojo;
	}

	public Map<String, LinkedHashSet<String>> getNumberlist() {
		return numberlist;
	}

	public void setNumberlist(Map<String, LinkedHashSet<String>> map) {
		this.numberlist = map;
	}

	public Map<String, LinkedHashSet<String>> getEmaillist() {
		return emaillist;
	}

	public void setEmaillist(Map<String, LinkedHashSet<String>> map) {
		this.emaillist = map;
	}

/*	@Override
	public String toString() {
		return nameList + "\n"+ numberlist + "\n" + emaillist;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emaillist == null) ? 0 : emaillist.hashCode());
		result = prime * result + ((nameList == null) ? 0 : nameList.hashCode());
		result = prime * result + ((numberlist == null) ? 0 : numberlist.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactMain other = (ContactMain) obj;
		if (emaillist == null) {
			if (other.emaillist != null)
				return false;
		} else if (!emaillist.equals(other.emaillist))
			return false;
		if (nameList == null) {
			if (other.nameList != null)
				return false;
		} else if (!nameList.equals(other.nameList))
			return false;
		if (numberlist == null) {
			if (other.numberlist != null)
				return false;
		} else if (!numberlist.equals(other.numberlist))
			return false;
		return true;
	}

	@Override
	public int compareTo(ContactMain o) {

		return nameList.getFirstName().compareTo(o.getNameList().getFirstName());
		
	}
	

}
