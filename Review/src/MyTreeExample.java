import java.io.IOException;
import java.util.Comparator;
import java.util.TreeMap;

public class MyTreeExample {

	public static void main(String a[])throws IOException {
		TreeMap<String, Object> hm = new TreeMap<String, Object>();
		hm.put("a", 123);
		hm.put("b", 147);
		hm.put("A", 79);
		hm.put("Z", 1.23);
		hm.put("j", 79);
		hm.put("0",189);
		hm.put("7", 192);
		System.out.println(hm);
		
	}
}
