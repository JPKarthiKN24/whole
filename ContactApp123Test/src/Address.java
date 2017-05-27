

import java.util.HashMap;
import java.util.Map;

public class Address {
	
	private String address;
	private String type;
	private Map<String,String> addressMap;
	
	public Address() {
		// TODO Auto-generated constructor stub
	address = new String();
	type = new String();
	addressMap = new HashMap<>();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public Map<String, String> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}

	@Override
	public String toString() {
		return "ContactAddress\n\t   ContactAddress -> " + address + "\n\t   Type -> " + type + "\n\t   Address -> " + addressMap + "]";
	}
	
	

}
