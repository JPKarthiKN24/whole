
public class Name {
public static void main(String[] args) {
	String s="I'm Karthik Shanmugam";
	s="ggg";
	System.out.println(s);
	
	s.concat("Salem");
	System.out.println(s);
	
	s=s.concat(" Salem");
	System.out.println(s);
	
	String s1="ggg";
	String s2="ggg";
	System.out.println(s1.equals(s2));
	
	String s3="ggg";
	String s4="gggg";
	System.out.println(s3.compareTo(s4));
	System.out.println(s4.compareTo(s3));
	
	
	StringBuffer s5=new StringBuffer("LOL");
	s5.append("HAAA");
	System.out.println(s5);
	
	s5.replace(0, 7, ":(");
	System.out.println(s5);
	
	
	
}
}
