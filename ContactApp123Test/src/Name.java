

public class Name {

	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String NickName;

	public Name() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNickName() {
		return NickName;
	}

	public void setNickName(String nickName) {
		NickName = nickName;
	}

	@Override
	public String toString() {
		return "\tContactName\n\t   FirstName -> " + FirstName + "\n\t   MiddleName ->" + MiddleName
				+ "\n\t   LastName -> " + LastName + "\n\t   NickName -> " + NickName + "";
	}

}
