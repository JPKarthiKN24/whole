import java.io.*;
import java.util.*;

public class Testqqq {

    public static void main(String[] args) {
      String s="abbca";
      ArrayList<Character> c=new ArrayList<>();
      char[] w = s.toCharArray();
      for(int t=0;t<s.length();t++){
      c.add(w[t]);
      }
      for(char e:c){
    	  System.out.println(e);
    	  
      }
      
    }
}