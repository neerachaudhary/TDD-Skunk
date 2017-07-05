
public class PairOfDice {
	Die d1;
	Die d2;
	
	public PairOfDice() {
		d1 = new Die();
		d2 = new Die();
	}
	
	public void roll() {
		d1.roll();
		d2.roll();
	}
	
	public boolean hasTwoOnes() {
		if(d1.getValue() == 1 && d2.getValue() == 1) {
			return true;
		}
		return false;
	}
	
	public boolean hasOneOne() {
		if(d1.getValue() == 1 || d2.getValue() == 1) {
			return true;
		}
		return false;
	}
	
	public int totalValue() {
		return (d1.getValue() + d2.getValue());
	}
	
	public String toString() {
		String d1string = d1.toString();
		String d2string = d2.toString();
		return d1string + "\n" + d2string;
	}
	
	
	public static void main(String[] args) {
		PairOfDice pod = new PairOfDice();
		pod.roll();
		System.out.println(pod);
	}
	
}