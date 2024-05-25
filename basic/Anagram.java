//An anagram of a string is another string that contains the same characters, 
//only the order of characters can be different.
//For example, “abcd” and “dabc” are an anagram of each other.

package basic;

import java.util.Arrays;
import java.util.Scanner;


public class Anagram {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String S1=scn.nextLine();
		String S2=scn.nextLine();
	 
		boolean ans=isAnagram(S1,S2);
		if(ans==true){
			System.out.println(" Are Anagram");
		}else{
			System.out.println("NOt a Anagram");
		}
		scn.close();
		

	}
	public static boolean isAnagram(String S1, String S2){
		  S1=S1.replaceAll("\\s", "");
		  S2=S2.replaceAll("\\s", "");
		  
		  if(S1.length()!=S2.length()){
			  return false;
		  }
		  char[] AS1=S1.toLowerCase().toCharArray();
		  char[] AS2=S2.toLowerCase().toCharArray();
		  Arrays.sort(AS1);
		  Arrays.sort(AS2);
		  
		  
		return Arrays.equals(AS1, AS2);
		
	}

}
