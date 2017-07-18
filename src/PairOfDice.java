
public class PairOfDice {
	Die die1;
	Die die2;
	
	public PairOfDice() {
		die1 = new Die();
		die2 = new Die();
	}
	
	public void roll() {
		die1.roll();
		die2.roll();
	}
	
	public boolean hasTwoOnes() {
		if(die1.getValue() == 1 && die2.getValue() == 1) {
			return true;
		}
		return false;
	}
	
	public boolean hasOneOne() {
		if(die1.getValue() == 1 || die2.getValue() == 1) {
			return true;
		}
		return false;
	}
	
	public int totalValue() {
		return (die1.getValue() + die2.getValue());
	}
	
	public String toString() {
		String d1string = die1.toString();
		String d2string = die2.toString();
		return d1string + "\n" + d2string;
	}
	
	
	public static void main(String[] args) {
		PairOfDice pod = new PairOfDice();
		pod.roll();
		System.out.println(pod);
	}
	
}