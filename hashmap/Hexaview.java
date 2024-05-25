package hashmap;
import java.util.*;
public class Hexaview {

	public static void main(String[] args) {
		  String str = "Hello_@123";
		    Map<Character, Integer> fmap = new HashMap<>();
		    
		    for(int i=0;i<str.length();i++){
		        char c =str.charAt(i);
		        if(c>='A'&& c<='Z'||c>='a'&& c<='z'){
		        	int val=fmap.getOrDefault(c,0)+1;
			        fmap.put(c,val);	
		        }
		        
		    }
		    System.out.print(fmap);

	}

}
