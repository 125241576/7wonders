package source;

public class Player {
	private String name;
	private int[] credit=new int[] {0,0,0};//credit[0] est CS,credit[1] est TM,credit[2] est **
	private int[] capacite;//[0] est capacite de math, [1] est capacite de langage, [2] est capacite d'informatique.
	private int argent=3;
	private CardManagement cm=new CardManagement();
	private ProvenanceDeEtudiant pde;
	private int superCredit=0;
	public Player(String name, ProvenanceDeEtudiant pde) {
		super();
		this.name = name;
		this.pde=pde;
		this.capacite=pde.getCapacite();
	
	}
	public String toString() {
		String s=new String("Player name:"+name+"\n"+pde+"Credit:\t\tCS:"+credit[0]+"/30\t\tTM:"+credit[1]+"/30\t\t**:"+credit[2]+"/30\tSuperCredit:"+superCredit+"\nCapacite:\tMath:"+capacite[0]+"\t\tLangage:"+capacite[1]+"\tInfo:"+capacite[2])+"\nL'argent:"+argent+"\n"+cm.toString();
		return s;
	}
	public boolean addCard(Card c) {
		if(c.getCost()[0]<=capacite[0]&&c.getCost()[1]<=capacite[1]&&c.getCost()[2]<=capacite[2]&&c.getCost()[3]<=argent) {
			this.cm.addCard(c);
			capacite[0]=capacite[0]-c.getCost()[0]+c.getGain()[0];
			capacite[1]=capacite[1]-c.getCost()[1]+c.getGain()[1];
			capacite[2]=capacite[2]-c.getCost()[2]+c.getGain()[2];
			argent=argent-c.getCost()[3];
			if(c.getCategorie().equals("CS")) {
				credit[0]+=c.getCredit();
			}
			else if(c.getCategorie().equals("TM")) {
				credit[1]+=c.getCredit();
			}
			if(c.getFiliereCours()==true) {
				credit[2]+=c.getCredit();
			}
			checkStatus(0);
			//cm.removeCard(c);
			System.out.println("OK!\n"+this.toString());
			
			return true;
		}
		return false;
		
	}
	public void checkStatus(int n) {
		if(capacite[0]>=pde.getAge(n).getCost()[0]&&capacite[1]>=pde.getAge(n).getCost()[1]&&capacite[2]>=pde.getAge(n).getCost()[2]) {
			argent=argent+pde.getAge(n).getGain()[3];
			superCredit+=pde.getAge(n).getGain()[4];
			pde.getAge(n).changeStatus();
		}
		
	}
	public void earnMoney() {
		argent+=3;
		System.out.println(this);
	}
	public void payMoney() {
		argent-=2;
	}
//	public static void main(String[] args) {
//		
//		Player player1=new Player("xhh",p1);
//		System.out.println(player1);
//		CardManager cm=new CardManager();
//		cm.initial();
//		player1.addCard(cm.getCard(1));
//		//System.out.println(player1);
//
//	}

}
