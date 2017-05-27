
public class StudentDetail {
	
	private int stuId;
	private String name;
	private int age;
	private String fatherName;
	private String address;
	
	public StudentDetail(int stuId, String name, int age, String fatherName, String address){
		
		this.stuId=stuId;
		this.name=name;
		this.age=age;
		this.fatherName=fatherName;
		this.address=address;
		
	}
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
