package source;

public class CardCours extends Card {
	private int credit;
	private String categorie;//TM et CS
	private boolean filiereCours=false; 
	public CardCours(String name, int[] cost, int[] gain, int credit, String categorie, boolean filiereCours) {
		super(name, cost, gain);
		this.credit = credit;
		this.categorie = categorie;
		this.filiereCours=filiereCours;
	}
	public String getCategorie() {
		return categorie;
	}
	public int getCredit() {
		return credit;
	}
	@Override
	public String toString() {
		return super.toString()+"\t|"+ credit +"\t|" + categorie+"\t\t|"+filiereCours+"\n" ;
	}
	
	public static void main(String[] args) {
		int [] i= {1,2,3,4};
		int [] j= {1,2,3};
	
		CardCours c1=new CardCours("LO43",i , j, 6, "CS",false) ;
		System.out.println(c1);
	}
	@Override
	public boolean getFiliereCours() {
		return filiereCours;
	}
}
