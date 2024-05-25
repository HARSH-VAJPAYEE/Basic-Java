package basic;

import java.util.*;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s1=scn.next();
		System.out.println(firstNonRepeating(s1));
		

	}
	public static int firstNonRepeating(String s1){
      Map<Character, Integer> fmap=new HashMap<>();
      
      for(char c:s1.toCharArray()){
    	  fmap.put(c,fmap.getOrDefault(c, 0)+1);
      }
      for (int i=0; i<s1.length();i++){
    	  char ch=s1.charAt(i);
    	  if (fmap.get(ch)==1){
    		  System.out.print(ch);
    		  return i;
    	  }
      }return -1;
      
		
	}

}
