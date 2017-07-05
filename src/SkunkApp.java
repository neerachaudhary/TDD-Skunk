
import java.util.Scanner;


public class SkunkApp {

	private SkunkDomain p1;
	private SkunkDomain p2;
	private Scanner stdin;
	
	public SkunkApp() {
		
		ReadandReturnPrompt("How many players?");
		//PairOfDice pod = new PairOfDice();
		//p1 = new Player("Player 1", pod);
	}
	
	public String ReadandReturnPrompt(String question)
	{
		System.out.println(question);
		stdin = new Scanner(System.in);
		String result = stdin.nextLine();
		return result;
	}
	
	
	public void play() {
		SkunkDomain curplayer = p1;
		boolean result = false, again = false;
		
		while(p1.isWinner() == false && p2.isWinner() == false) {
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
			if(curplayer == p1) {
				curplayer = p2;
			} else {
				curplayer = p1;
			}	
		}
		
		if(p1.isWinner()) {
			System.out.println(p1.getName() + " wins!");
		} else {
			System.out.println(p2.getName() + " wins!");
		}
	}
	
	public static void main(String[] args) {
		SkunkApp g = new SkunkApp();
		g.play();
	}
	
}