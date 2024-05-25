package hashmap;
import java.util.*;
public class FirstNonRepeating {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Map<Character , Integer> Occurance = new HashMap<>();
		
		String str=input.nextLine();
		
		char[] ch=str.toLowerCase().toCharArray();
		
		for(int i=0; i<ch.length;i++){
			if(Occurance.containsKey(ch[i])){
				Occurance.put(ch[i], Occurance.get(ch[i])+1);
			}else {
				Occurance.put(ch[i],1);
			}
			
		}
		for(char c:ch){
			if(Occurance.get(c)==1){
				System.out.println(c);
				break;
			}
		}
    input.close();
	}

}
