
import java.util.Random;

public class Die {

	private int value;
	
	public Die() {
		value = 0;
	}
	
	public void roll() {
		Random r = new Random();
		value = r.nextInt(6) + 1;
	}
	
	public int getValue() {
		return value;
	}
	
	
	public String toString() {
		return ("Die Value: " + value);
		
	}
	
	
	public static void main(String[] args) {
		Die d = new Die();
		d.roll();
		String thedie = d.toString();
		System.out.println(thedie);
	}
	
}