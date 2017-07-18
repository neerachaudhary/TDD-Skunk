
public class NextPlayer extends CurrentPlayer {

	public NextPlayer(String name, PairOfDice pod) {
		super(name, pod);
	}
	
	@Override
	public boolean rollAgain() {
		if(sk.getRoundTotal() < 20) {
			return true;
		}
		return false;
	}

}