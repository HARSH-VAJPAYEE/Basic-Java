package recursion;

public class Toss {

	public static void main(String[] args) {
//		TossAns(3,"");
		Stair(0,4,"");

	}

	private static void Stair(int i,int n, String ans) {
		if (i==n){
			System.out.println(ans);
			return;
		}
		if (i>n){
			return;
		}
		Stair(i+1,n,ans+"1");
		Stair(i+2,n,ans+"2");
//		Stair(i+3,n,ans+"3");
		
	}

	private static void TossAns(int i, String ans) {
		if (i==0){
			System.out.println(ans);
			return ;
		}
//		System.out.println(ans);
		TossAns(i-1,ans+"H");
		TossAns(i-1,ans+"T");
		
		
		
	}
	

}
