
public class Test {
	public static void main(String[] args) {

		// Case #1
		String s = "abc";
		String s1 = "abc";
		System.out.println("Case 1");
		if (s1 == s) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		if (s1.equals(s)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// Case #2
		String s2 = "abc";
		System.out.println("Case 2");
		String s3 = new String("abc");
		

		if (s2 == s3) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		if (s2.equals(s3)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// Case #3
		String s4 = "bce";
		String s5 = "abc";
		System.out.println("Case 3");
		if (s4 == s5) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		if (s4.equals(s5)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// Case #4
		String s6 = "Sachin";
		String s7 = "SACHIN";
		System.out.println("Case 4");
		if (s6 == s7) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		if (s6.equals(s7)) {
			System.out.println("True");
		} else {

			System.out.println("False");
		}

		if (s6.equalsIgnoreCase(s7)) {
			System.out.println("True");
		} else {

			System.out.println("False");
		}
		
		StringBuffer sb=new StringBuffer("Sachin"); 
		String s9=sb.toString();
       if(s9.equals(s6)){
    	   
    	   System.out.println("True");
       }
       else{
    	   System.out.println("False");
       }
	}

}
