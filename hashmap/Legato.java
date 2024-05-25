// Write a program to analyze a string and perform the following operations:
//1) Identify the highest ASCII character from the given string.
//11) Find the number of occurrences of the letter having the highest ASCII value in the given string. 1) If n is the number of times the highest ASCII character repeated, then find the n positioned character from A to Z and print that character n times in uppercase. Also, print the highest ASCII value among the letters in the given string in the second line.
//Note: Special characters and numbers are also allowed as input except space. The string can be present in any case lowercase, uppercase or both. if n>26 start again from A.
//Read the input from STDIN (standard input) and write the output to STDOUT (standard output). Do not print any arbitrary strings while reading the input or printing the output as those would contribute to STDOUT.
//Constraints:
//1) The input string length should be greater than zero.
//Input Format:
//The input will be the string to be analyzed.
//Output Format:
//The first line of output will be the corresponding letter from the English Alphabet in uppercase. The second line of output will be the highest ASCII value among all the characters 
//


package hashmap;
import java.util.*;
public class Legato {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String str=scan.next();
		
		int res =0;
		Map<Character, Integer> fmap =new HashMap<>();
		for (int i=0;i<str.length();i++){
			fmap.put(str.charAt(i),fmap.getOrDefault(str.charAt(i), 0)+1);
			int val = (int) str.charAt(i);
			if (res< val ){
				res=val;
			}
		}
	
//		System.out.println(fmap);
		char c= (char) res;
		int ans =fmap.get((char)res);
//		System.out.println(ans  );
		int count=1;
		for(int i=65;i<65+27;i++){
			if (count==ans){
				c=(char)i;
				break;	
			}
			count++;
		}
		for (int i=0;i<ans;i++){
			System.out.print(c);
		}System.out.println();
		System.out.println(res);

	}

}
