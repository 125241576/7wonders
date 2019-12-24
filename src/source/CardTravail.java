package source;

public class CardTravail extends Card {
	private int point;
	
	public CardTravail(String name, int[] cost, int[] gain, int point) {
		super(name, cost, gain);
		this.point = point;
	}

	@Override
	public String getCategorie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCredit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getFiliereCours() {
		// TODO Auto-generated method stub
		return false;
	}

}
