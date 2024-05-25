package patterns;

public class Pattern_31 {
    public static void main(String[] args) {
    	int n=5;
    	int i=1;
    	
    	while(i<=n){
    		int c=n;
    		for(int j=1;j<=n;j++){
    			if(i+j==n+1){
    				System.out.print("*  ");
    			}else{
    			System.out.print(c+"  ");}
    			c--;
    			
    		}
    		System.out.println();
    		i++;
    		
    	}
    		
	   
}
}
