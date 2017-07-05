
import java.util.Scanner;

public class Player extends SkunkDomain {

	private Scanner y;

	public Player(String name, PairOfDice pod) {
		super(name, pod);
	}
	
	@Override
	public boolean rollAgain() {
		y = new Scanner(System.in);
		System.out.println("Would you like to roll again [y/n]? ");
		String response = y.nextLine();
		while(!response.equals("y") && !response.equals("n")) {
			System.out.println("Would you like to roll again [y/n]? ");
			response = y.nextLine();			
		}
		if(response.equals("y")) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		Player hp = new Player("Bob", new PairOfDice());
		System.out.println(hp.rollAgain());
	}
	

}