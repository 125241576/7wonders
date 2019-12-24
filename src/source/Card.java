package source;

public abstract class Card {
	private String name;
	private int[] cost=new int[4];//cost[0] est capacite de math, cost[1] est capacite de langage, cost[2] est capacite d'informatique, cost[3] est l'argent. 
	private int[] gain=new int[3];//gain[0] est capacite de math, gain[1] est capacite de langage, gain[2] est capacite d'informatique.
	public Card(String name,  int[] cost, int[] gain) {
		super();
		this.name = name;
		this.cost = cost;
		this.gain = gain;
	}
	public int[] getCost() {
		return cost;
	}
	public int[] getGain() {
		return gain;
	}
	public abstract String getCategorie();
	@Override
	public String toString() {
		return  name + "\t|" + cost[0] + "\t|"+ cost[1] + "\t|"+ cost[2] + "\t|"+ cost[3] + "\t|" + gain[0] + "\t|"+ gain[1] + "\t|"+ gain[2] ;
	}
	public abstract int getCredit();
	public abstract boolean getFiliereCours();
	public String getName() {
		return name;
	}

	
}
