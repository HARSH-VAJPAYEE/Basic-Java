package basic;
// find the number in the string 
public class FindNumb {

	public static void main(String[] args) {
		
		String str="2coditas786";
//		char[] ch= str.toCharArray();
//		int numb=Integer.parseInt(str);
		for(int i=0;i<str.length();i++){
			char ch1=str.charAt(i);
			if(ch1>=48 && ch1<=57){
				System.out.println(ch1);
			}
			
		}
//		System.out.println(numb);

	}

}
