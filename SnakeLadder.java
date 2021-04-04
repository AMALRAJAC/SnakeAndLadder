public class SnakeLadder {
	public static int temp=0;
	public static int dice=0;
	public static int playerposition=0;
	
	public static void main(String[] args) {
		
		for(int i=0;playerposition<=100;i++) {
			System.out.println("\n----------------------------------------------------------------------------");
			System.out.println("\n\t\t\t||player position==="+playerposition+"||");
			System.out.println("\n----------------------------------------------------------------------------");
			playcheck();
			
			if (playerposition>=100) {
				System.out.println("\n----------------------------------------------------------------------------");
				System.out.println("\n\t\t\t||player won||");
				System.out.println("\n----------------------------------------------------------------------------");
				System.exit(0);
			}
		}
	}
	//player1 code
	
	public static int ladder(int dice) {
		playerposition=playerposition+dice;
		System.out.print("\nplayer position="+playerposition);
		return 0;
	}
	public static int snake(int dice) {
		playerposition=playerposition-dice;
		System.out.print("\nplayer position="+playerposition);
		return 0;
	}
	public static int dice() {
		int dice= (int)Math.floor(Math.random()*10)%6+1;
		System.out.println("\nplayer dice number= "+dice);
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
			System.out.print("\n player got ladder");
			temp=dice();
			ladder(temp);
			break;
		case 2:
			System.out.print("\nplayer got snake bit");
			temp=dice();
			snake(temp);
			break;
		case 3:
			System.out.print("\n no play for player");
			break;
					
		}
		
		return 0;
	}	
	
	
}
