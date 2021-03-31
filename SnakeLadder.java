import java.util.Scanner;
public class SnakeLadder {
	public static int temp=0;
	
	    public static void main (String [] args)
	    {
	    	for (int i=0;temp<=100;i++) {
	    		
	    	System.out.println("/////enter 1 to play again////// ");
	    	System.out.println("/////enter 0 to pause play ////// ");
	    	
	    	Scanner sc = new Scanner(System.in);
        	int check  = sc.nextInt();
	        
	        if ( check ==1) {
	        	
	        	//user input
	        	int player1Position1 =(int) Math.floor(Math.random()*10)%6 +1 ;
	        	System.out.println("dice number = "+player1Position1);
	        	
	        if (temp+player1Position1<=100) {
	        	
	        	temp = temp +player1Position1;
	        	temp=snakeBit(temp);
	        	temp=ladder(temp);
	        	System.out.println("player position is: "+temp);
	        	
	        	//condition for checking winner
	        	
	        	if (temp==100) {
	        		System.out.println("player won");
	        		System.exit(0);
	        	}
	        }
	        if(temp<0) {
	        	// if number goes negative
        		temp=0;
        	}
	        }
	        if(check==0) {
	        	// player want to pause play
	        	System.out.println("player stays at "+temp);
	        }
	    	}
	    }
		//defining snake bits in program
	    private static int snakeBit(int temp) {
			switch(temp) {
			case 17:
				System.out.println("got snake bit");
				temp=temp-10;
				break;
			case 54:
				System.out.println("got snake bit");
				temp=temp-20;
				break;
			case 62:
				System.out.println("got snake bit");
				temp=temp-44;
				break;
			case 64:
				System.out.println("got snake bit");
				temp=temp-4;
				break;
			case 87:
				System.out.println("got snake bit");
				temp=temp-63;
				break;
			case 93:
				System.out.println("got snake bit");
				temp=temp-20;
				break;
			case 95:
				System.out.println("got snake bit");
				temp=temp-20;
				break;
			case 99:
				System.out.println("got snake bit");
				temp=temp-21;
				break;	
			
			}
			return temp;
			
		}
	    //defining ladders in program
		private static int ladder(int temp) {
			switch(temp) {
			case 4:
				System.out.println("got ladder");
				temp=temp+10;
				break;
			case 9:
				System.out.println("got ladder");
				temp=temp+22;
				break;
			case 20:
				System.out.println("got ladder");
				temp=temp+18;
				break;
			case 40:
				System.out.println("got ladder");
				temp=temp+19;
				break;
			case 28:
				System.out.println("got ladder");
				temp=temp+56;
				break;
			case 63:
				System.out.println("got ladder");
				temp=temp+18;
				break;
			case 71:
				System.out.println("got ladder");
				temp=temp+20;
				break;
			}
			return temp;
			
			
		}
}	                