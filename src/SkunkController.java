
public class SkunkController {

	private int gametotal;
	private int roundtotal;
	
	public SkunkController() {
		gametotal = roundtotal = 0;
	}
	
	public void addToGameTotal() {
		gametotal += roundtotal;
		resetRoundTotal();
	}
	
	public void addToRoundTotal(int value) {
		roundtotal += value;
	}

	public void resetGameTotal() {
		gametotal = 0;
		resetRoundTotal();
	}

	public void resetRoundTotal() {
		roundtotal = 0;
	}

	public int getRoundTotal() {
		return roundtotal;
	}

	public int getGameTotal() {
		return gametotal;
	}
	
}

