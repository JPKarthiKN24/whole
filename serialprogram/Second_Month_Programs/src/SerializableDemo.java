import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class SerializableDemo {
	public static void main(String args[]) throws Exception{
		Student s=new Student(12,"Karthik",21);
	/*	s.setId(54);
		s.setAge(21);
		s.setName("revati");
		*/
		//Serialization
		FileOutputStream fos=new FileOutputStream("f.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
	    oos.writeObject(s);
		System.out.println("Serializble");
		//Deserialization
		FileInputStream fis=new FileInputStream("f.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s2=(Student)ois.readObject();
		System.out.println("Deserialization");
		System.out.println(s2.id+" "+s2.name+" "+s2.age);
		
		
		
		
		
	}

}
