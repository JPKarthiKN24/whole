import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainController {
	public static void main(String[] args) throws IOException {
		Student s1 = new Student(211, "ravi");

		FileOutputStream fout = new FileOutputStream("notes.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		out.flush();
		System.out.println("success");
	}

}
