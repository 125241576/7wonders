package source;

public class Age {
	private boolean status=false;
	private String age;
	private int[] cost=new int[3];//cost[0] est capacite de math, cost[1] est capacite de langage, cost[2] est capacite d'informatique. 
	private int[] gain=new int[5];//gain[0] est capacite de math, gain[1] est capacite de langage, gain[2] est capacite d'informatique.
	public Age(String age, int[] cost, int[] gain) {
		super();
		this.age = age;
		this.cost = cost;
		this.gain = gain;
	}
	public String toString() {
		return age+"\t|"+cost[0]+"\t|"+cost[1]+"\t|"+cost[2]+"\t|"+gain[0]+"\t|"+gain[1]+"\t|"+gain[2]+"\t|"+gain[3]+"\t|"+gain[4]+"\t|"+status+"\n";
	}
	public int[] getCost() {
		return cost;
	}
	public int[] getGain() {
		return gain;
	}
	public void changeStatus() {
		status=true;
	}
	
}
