import java.util.Scanner;
public class SnakeLadder {
	public static int temp=0;
	public static int temp1=0;
	public static int count=0;
	public static int diceRoll=0;
	public static int diceRoll2=0;
	
	    public static void main (String [] args)
	    {
	    	for (int i=0;temp<=100;i++) {
	    		
	    		System.out.println("\n\n\t\t\t\t********enter 1 to play again********** ");
	    		System.out.println("\t\t\t\t********enter 0 to pause play ********* ");
	    	
	    		Scanner sc = new Scanner(System.in);
	    		int check  = sc.nextInt();
	        
	    		if ( check ==1) {
	        	
	        	//user input
	    				diceRoll=playAgain(diceRoll);
	    				diceRoll2=playAgain(diceRoll2);
	    				System.out.println("\t\t\t\tdice number of player1 = "+diceRoll);
	    				System.out.println("\t\t\t\tdice number of player2 = "+diceRoll2);
	    				count=count+1;
	    					if (temp+diceRoll<=100 && temp1+diceRoll2<=100) {
	        	
	    						temp = temp +diceRoll;
	    						temp=snakeBit(temp);	
	    						int flag=temp;
	    						temp=ladder(temp);
                                if(temp!=flag) {
                                	diceRoll=playAgain(diceRoll);
                                	System.out.println("player1 got another chance");
                                	System.out.println("\t\t\t\t new dice number of player1 = "+diceRoll);
                                	temp = temp +diceRoll;
                                }
	    						System.out.println("\n\n\n\t\t\t\tplayer1 position is: "+temp);
	        	
	    						temp1 = temp1 +diceRoll2;
	    						temp1=snakeBit(temp1);
	    						int flag1=temp1;
	    						temp1=ladder(temp1);
	    						 if(temp1!=flag1) {
	                                	diceRoll2=playAgain(diceRoll2);
	                                	System.out.println("player2 got another chance");
	                                	System.out.println("\t\t\t\t new dice number of player2 = "+diceRoll2);
	                                	temp1 = temp1 +diceRoll2;
	                                }
	    						System.out.println("\t\t\t\tplayer2 position is: "+temp1);
	    						//condition for checking winner
	        	
	    							if (temp==100 ||temp1==100) {
	    									if(temp==100) {
	    										System.out.println("\n\n\t\t\t\t|||*****player1 won*******|||");
	    										System.out.println("\n\t\t\t\tnumber of times dice rolled= "+count);
	    										System.exit(0);	
	    									}else {
	    										System.out.println("\n\n\t\t\t\t|||****player2 won******|||");
	    										System.out.println("\n\t\t\t\t new number of times dice rolled= "+count);
	    										System.exit(0);
	    									}
	    							}		
	        }
	        if(temp<0 ||temp1<0) {
	        	if(temp<0) {
	        		temp=0;
	        	}else {
	        		temp1=0;
	        	}
        	}
	 }
	 if(check==0) {
	        	// player want to pause play
	        	System.out.println("player1 stays at "+temp);
	        	System.out.println("player2 stays at "+temp1);
	  }
   }
}
	    private static int playAgain(int player1Position1) {
	    	int player1Position11 =(int) Math.floor(Math.random()*10)%6 +1 ;
			return player1Position11;
	    	
	    }
		//defining snake bits in program
	    private static int snakeBit(int temp) {
			switch(temp) {
			case 17:
				System.out.println("got snake bit at 17");
				temp=temp-10;
				break;
			case 54:
				System.out.println("got snake bit at 54");
				temp=temp-20;
				break;
			case 62:
				System.out.println("got snake bit at 62");
				temp=temp-44;
				break;
			case 64:
				System.out.println("got snake bit at 64");
				temp=temp-4;
				break;
			case 87:
				System.out.println("got snake bit at 87");
				temp=temp-63;
				break;
			case 93:
				System.out.println("got snake bit at 93");
				temp=temp-20;
				break;
			case 95:
				System.out.println("got snake bit at 95");
				temp=temp-20;
				break;
			case 99:
				System.out.println("got snake bit at 99");
				temp=temp-21;
				break;	
			
			}
			return temp;
			
		}
	    //defining ladders in program
		private static int ladder(int temp) {
			switch(temp) {
			case 4:
				System.out.println("got ladder at 4");
				temp=temp+10;
				break;
			case 9:
				System.out.println("got ladder at 9");
				temp=temp+22;
				break;
			case 20:
				System.out.println("got ladder at 20");
				temp=temp+18;
				break;
			case 40:
				System.out.println("got ladder at 40");
				temp=temp+19;
				break;
			case 28:
				System.out.println("got ladder at 28");
				temp=temp+56;
				break;
			case 63:
				System.out.println("got ladder at 63");
				temp=temp+18;
				break;
			case 71:
				System.out.println("got ladder at 71");
				temp=temp+20;
				break;
			}
			return temp;
			
			
		}
}	                
