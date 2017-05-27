package contactnewapp;

import java.util.HashMap;
import java.util.Map;

public class Pojo {
	
	
	public static Map<String, StoreDatas> obj=new HashMap<String, StoreDatas>();
	
	public static void retrive(String name)
	{
		
		System.out.println("email:"+obj.get(name).getEmail());
		System.out.println("mobNo:"+obj.get(name).getMonNo());

	}

	
	public static void showContacts()
	{
		
		for ( Map.Entry<String, StoreDatas> entry : obj.entrySet()) {
		    String key = entry.getKey();
		    StoreDatas obj1 = entry.getValue();
		    
		    System.out.println(obj1.getName());
		    System.out.println(obj1.getMonNo());
		    System.out.println(obj1.getEmail());
		    
		}

	}

	

}
