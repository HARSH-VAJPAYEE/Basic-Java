package hashmap;
import java.util.*;
public class SecondrepeatingChar {

	public static void main(String[] args) {
		String s = "helloworld";
		Map<Character , Integer> fmap = new HashMap<>();
        int count=0;
		for(char c: s.toCharArray()){
		fmap.put(c, fmap.getOrDefault(c, 0)+1);
		
		
		if( fmap.get(c)!=1 ){
			count++;
			if (count ==2){
			System.out.println(c);
			break;}


			}
		}

		
		
		
	}

}
