
public abstract class SkunkDomain {
	
	protected PairOfDice pairofdice;
	protected String name;
	protected SkunkController controller;
	
	public SkunkDomain(String name, PairOfDice pod) {
		this.name = name;
		this.pairofdice = pod;
		controller = new SkunkController();
	}

	public abstract boolean rollAgain();
	
	public boolean rollDice() {
		pairofdice.roll();
		System.out.println(pairofdice);
		if(pairofdice.hasOneOne() == false) {
			controller.addToRoundTotal(pairofdice.totalValue());
			if(controller.getRoundTotal() + controller.getGameTotal() >= 100) {
				return false;
			}
		} else if(pairofdice.hasTwoOnes() == true) {
			System.out.println("You rolled two ones.");
			controller.resetGameTotal();
			return false;
		} else {
			System.out.println("You rolled a one.");
			controller.resetRoundTotal();
			return false;
		}
		return true;
	}
	
	public boolean isWinner() {
		if(controller.getGameTotal() >= 100) {
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}
	
	public void endRound() {
		controller.addToGameTotal();
	}
	
	public int getGameTotal() {
		return controller.getGameTotal();
	}
	
}
