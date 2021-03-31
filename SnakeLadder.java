import java.util.Scanner;
public class SnakeLadder {
	public static int temp=0;
	
	    public static void main (String [] args)
	    {
	    	
	    	
	        System.out.println("ENTER THE VALUE BETWEEN 1 TO 6....!");
	        
	        
	        for (int i=0;temp<100;i++) {
	        	//user input
	        	Scanner sc = new Scanner(System.in);
	        	int player1Position1 = sc.nextInt();
	        if (player1Position1 <=6 && player1Position1>0 && temp+player1Position1<=100) {
	        	temp = temp +player1Position1;
	        	System.out.println("player position is"+temp);
	        	//condition for checking winner
	        	if (temp==100) {
	        		System.out.println("player won");
	        	}
	        }
	        
	    }
	    }
}
	        
	        