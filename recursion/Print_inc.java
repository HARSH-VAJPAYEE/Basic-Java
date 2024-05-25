package recursion;

public class Print_inc {

	public static void main(String[] args) {
		PDI(4);

	}

	private static void PDI(int i) {
		if (i==0){
			return;
		}
		System.out.println("Hello"+i);
		PDI(i-1);
		System.out.println("bye"+i);
		
	}

	private static void PI(int i) {
		// TODO Auto-generated method stub
		if(i == -1){
			return;
		}
		PI(i-1);
		System.out.println(i);
		
	}
	
	
	
	
	

}
