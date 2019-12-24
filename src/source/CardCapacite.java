package source;

public class CardCapacite extends Card {

	public CardCapacite(String name, int[] cost, int[] gain) {
		super(name, cost, gain);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"\t|\\\t|\\"+"\n";
	}

	@Override
	public String getCategorie() {
		return "";
	}
	public int getCredit() {
		return 0;
	}

	@Override
	public boolean getFiliereCours() {
		return false;
	}

}
