
public class SnakeLadder {
	public static int temp=0;
	public static int count=0;
	public static int dice=0;
	public static int playerposition=0;
	public static int playerposition1=0;
	public static int dice1=0;
	public static int temp1=0;
	
	public static void main(String[] args) {
		
		for(int i=0;;i++) {
			System.out.println("\n----------------------------------------------------------------------------");
			System.out.println("\n\t\t\t||player1 position==="+playerposition+"||");
			System.out.println("\n\t\t\t||player2 position==="+playerposition1+"||");
			System.out.println("\n----------------------------------------------------------------------------");
			playcheck();
			System.out.println("\n\t\t\t||player1 position==="+playerposition+"||");
			System.out.println("\n//////////////////////////////////////////////////////////////////////////////");
			playcheck1();
			System.out.println("\n\t\t\t||player1 position==="+playerposition1+"||");
			
			if (playerposition<0) {
				playerposition=0;
				System.out.println("\nposition set to 0");
			}
			if(playerposition>100) {
				playerposition=100;
				System.out.println("\nposition set to 100");
			}
			if(playerposition==100) {
				System.out.println("\n----------------------------------------------------------------------------");
				System.out.println("\n\t\t\t||player1 won||");
				System.out.println("\n\t\t\tcount= "+count);
				System.out.println("\n----------------------------------------------------------------------------");
				System.exit(0);
			}
			
			if(playerposition1<0) {
				playerposition1=0;
				System.out.println("\nposition set to 0");
			}
			if(playerposition1>100) {
				playerposition1=100;
				System.out.println("\nposition set to 100");
			}
			if(playerposition1==100) {
				System.out.println("\n----------------------------------------------------------------------------");
				System.out.println("\n\t\t\t||player2 won||");
				System.out.println("\n\t\t\tcount= "+count);
				System.out.println("\n----------------------------------------------------------------------------");
				System.exit(0);
			}
			count=count+2;
		}
	}
	//player1 code
	
	public static int ladder(int dice) {
		playerposition=playerposition+dice;
		System.out.print("\nplayer1 position="+playerposition);
		
		if (playerposition<0) {
			playerposition=0;
			System.out.println("\nposition set to 0");
		}
		if(playerposition>100) {
			playerposition=100;
			System.out.println("\nposition set to 100");
		}

		if(playerposition==100) {
			System.out.println("\n----------------------------------------------------------------------------");
			System.out.println("\n\t\t\t||player1 won||");
			System.out.println("\n\t\t\tcount= "+count);
			System.out.println("\n----------------------------------------------------------------------------");
			System.exit(0);
		}
		System.out.print("\n\nnext play");
		playcheck();
		count=count+1;
		return 0;
	}
	public static int snake(int dice) {
		playerposition=playerposition-dice;
		System.out.print("\nplayer1 position="+playerposition);
		return 0;
	}
	public static int dice() {
		int dice= (int)Math.floor(Math.random()*10)%6+1;
		System.out.println("\nplayer1 dice number= "+dice);
			return dice;
	}
	public static int playcheck() {
		int x= (int)Math.floor(Math.random()*10)%3+1;
		play(x);
		return 0;
	}
	public static int play(int x) {
		switch(x) {
		case 1:
			System.out.print("\n player1 got ladder");
			temp=dice();
			ladder(temp);
			break;
		case 2:
			System.out.print("\nplayer1 got snake bit");
			temp=dice();
			snake(temp);
			break;
		case 3:
			System.out.print("\n no play for player 1");
			break;
					
		}
		
		return 0;
	}	
	
	//player2 code
	public static int ladder1(int dice1) {
		playerposition1=playerposition1+dice1;
		System.out.print("\nplayer2 position="+playerposition1);
		
		if(playerposition1<0) {
			playerposition1=0;
			System.out.println("\nposition set to 0");
		}
		if(playerposition1>100) {
			playerposition1=100;
			System.out.println("\nposition set to 100");
		}
		if(playerposition1==100) {
			System.out.println("\n----------------------------------------------------------------------------");
			System.out.println("\n\t\t\t||player2 won||");
			System.out.println("\n\t\t\tcount= "+count);
			System.out.println("\n----------------------------------------------------------------------------");
			System.exit(0);
		}
		System.out.print("\n\nnext play");
		playcheck1();
		count=count+1;
		return 0;
	}
	public static int snake1(int dice1) {
		playerposition1=playerposition1-dice1;
		System.out.print("\nplayer2 position="+playerposition1);
		return 0;
	}
	public static int dice1() {
		int dice1= (int)Math.floor(Math.random()*10)%6+1;
		System.out.println("\nplayer2 dice number= "+dice1);
			return dice1;
		}
	
	public static int playcheck1() {
		int x1= (int)Math.floor(Math.random()*10)%3+1;
		play1(x1);
		return 0;
		
	}
public static int play1(int x) {
	switch(x) {
	case 1:
		System.out.print("\n player2 got  ladder");
		temp1=dice1();
		ladder1(temp1);
		break;
	case 2:
		System.out.print("\n player2 got snake bit");
		temp1=dice1();
		snake1(temp1);
		break;
	case 3:
		System.out.print("\n no play for player2");
		break;
				
	}
	
	return 0;
}	
}
