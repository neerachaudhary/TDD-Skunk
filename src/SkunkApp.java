
import java.util.Scanner;

public class SkunkApp {

	private SkunkDomain player1;
	private SkunkDomain player2;
	private Scanner stdin;
	
	public SkunkApp() {
		
		stdin = new Scanner(System.in);
		System.out.println("How many players? [1/8]");
		int i = stdin.nextInt();
		while(i != 1 && i > 9) {
			System.out.println("How many players? [1/2]");
			i = stdin.nextInt();
		}
		PairOfDice pod = new PairOfDice();
		player1 = new CurrentPlayer("Player 1", pod);
		if(i == 2) {
			player2 = new CurrentPlayer("Player 2", pod);
		} else {
			player2 = new NextPlayer("Player 2", pod);
		}
		
	}
	
	public void play() {
		
		SkunkDomain curplayer = player1;
		boolean result = false, again = false;
		
		while(player1.isWinner() == false && player2.isWinner() == false) {
			result = curplayer.rollDice();
			if(result == true) {
				again = curplayer.rollAgain();
			} else {
				again = false;
			}
			while(again == true && curplayer.isWinner() == false) {
				result = curplayer.rollDice();
				if(result == true) {
					again = curplayer.rollAgain();
				} else {
					again = false;
				}			
			}
			curplayer.endRound();
			System.out.println("Total Score of " + curplayer.getName() + ": " + curplayer.getGameTotal());
			System.out.println("*************");
			if(!curplayer.isWinner()) {
				System.out.println("Switching players");
			}
			if(curplayer == player1) {
				curplayer = player2;
			} else {
				curplayer = player1;
			}	
		}
		
		if(player1.isWinner()) {
			System.out.println(player1.getName() + " wins!");
		} else {
			System.out.println(player2.getName() + " wins!");
		}
	}
	
	public static void main(String[] args) {
		SkunkApp g = new SkunkApp();
		g.play();
	}
	
}