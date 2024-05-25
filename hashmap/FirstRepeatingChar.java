package hashmap;

import java.util.*;

public class FirstRepeatingChar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str=input.nextLine();
		
		Map<Character, Integer> OccuranceMap=new HashMap<>();
		
		char[]ch= str.toLowerCase().toCharArray();
		int Flag=0;
		for(int i=0;i<ch.length;i++){
			if(OccuranceMap.containsKey(ch[i])){
				OccuranceMap.put(ch[i], OccuranceMap.get(ch[i])+1);
				System.out.println("Occured "+ch[i]+" at "+ (i+1));
				Flag++;
				break;
			}
			else {
				OccuranceMap.put(ch[i],1);
				
			}
		}
		if (Flag==0){
			System.out.println(-1);
		}

	}

}
