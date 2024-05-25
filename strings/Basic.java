package strings;

public class Basic {

	public static void main(String[] args) {
		String str1=new String("Harsh");
		String str2=new String("Harsh");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println("_______________________________________");
		String str3= "Harsh";
		String str4= "Harsh";
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		System.out.println("_______________________________________");
		System.out.println(str1==str4);
		System.out.println(str1.equals(str4));
		
		
		

	}

}
