
import java.util.Random;

public class Die {

	private int value;
	
	public Die() {
		value = 0;
	}
	
	public void roll() {
		Random random = new Random();
		value = random.nextInt(6) + 1;
	}
	
	public int getValue() {
		return value;
	}
	
	
	public String toString() {
		return ("Die Value: " + value);
		
	}
	
	
	public static void main(String[] args) {
		Die die = new Die();
		die.roll();
		String thedie = die.toString();
		System.out.println(thedie);
	}
	
}