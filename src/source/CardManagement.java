package source;

import java.util.ArrayList;
import java.util.Random;

public class CardManagement {
	private ArrayList<Card> card;
	public CardManagement(ArrayList<Card> card) {
		super();
		this.card = card;
	}
	
	public CardManagement() {
		card=new ArrayList<Card>();
	}

	@Override
	public String toString() {
		String s=new String("Cours\t|\t"+" "+" "+" "+"Cost\t\t\t|\tGain\t\t|Credit\t|Categorie\t|**\n\t|Math\t|Langage|Info\t|Argent\t|Math\t|Langage|Info\t|\t|\t\t|\n");
		for(Card c:card) {
			s=s+c.toString();
		}
		s+="------------------------------------------------------------------------------------------------------------------------\n";
		return s;
	}
	public void initial() {
		//CS
		CardCours cs1=new CardCours("LO43", new int[] {1,0,1,0}, new int[] {1,0,1}, 6, "CS", false) ;
		CardCours cs2=new CardCours("MT42", new int[] {1,0,1,0}, new int[] {1,0,1}, 6, "CS", false) ;
		CardCours cs3=new CardCours("BD40", new int[] {0,1,1,0}, new int[] {0,1,1}, 6, "CS", false) ;
		CardCours cs4=new CardCours("LP4A", new int[] {1,1,0,0}, new int[] {1,1,0}, 3, "CS", false) ;
		CardCours cs5=new CardCours("LP4B", new int[] {0,1,1,0}, new int[] {0,1,1}, 3, "CS", false) ;
		CardCours cs6=new CardCours("AG44", new int[] {1,0,1,0}, new int[] {1,0,1}, 6, "CS", false) ;
		
		//TM
		CardCours tm1=new CardCours("AD50", new int[] {1,0,1,0}, new int[] {1,0,1}, 6, "TM", false) ;
		CardCours tm2=new CardCours("AG51", new int[] {1,0,1,0}, new int[] {1,0,1}, 6, "TM", false) ;
		CardCours tm3=new CardCours("BD50", new int[] {0,1,1,0}, new int[] {0,1,1}, 6, "TM", true) ;
		CardCours tm4=new CardCours("BD51", new int[] {1,1,0,0}, new int[] {1,1,0}, 3, "TM", true) ;
		CardCours tm5=new CardCours("GL51", new int[] {0,1,1,0}, new int[] {0,1,1}, 3, "TM", true) ;
		CardCours tm6=new CardCours("GL52", new int[] {1,0,1,0}, new int[] {1,0,1}, 6, "TM", true) ;
		
		//Capacite
		CardCapacite c1=new CardCapacite("Calcul", new int[] {0,1,0,1}, new int[] {2,1,0});
		CardCapacite c2=new CardCapacite("Anglais", new int[] {0,0,1,1}, new int[] {0,2,1});
		CardCapacite c3=new CardCapacite("Algo", new int[] {1,0,0,1}, new int[] {1,0,2});
		CardCapacite c4=new CardCapacite("Finances", new int[] {1,0,0,0}, new int[] {2,0,0});
		CardCapacite c5=new CardCapacite("PS", new int[] {0,0,1,0}, new int[] {0,0,2});
		CardCapacite c6=new CardCapacite("Traduction", new int[] {0,1,0,0}, new int[] {0,2,0});
		this.card.add(cs1); 
		this.card.add(cs2);
		this.card.add(cs3);
		this.card.add(cs4);
		this.card.add(cs5);
		this.card.add(cs6);
		
		this.card.add(tm1);
		this.card.add(tm2);
		this.card.add(tm3);
		this.card.add(tm4);
		this.card.add(tm5);
		this.card.add(tm6);
		
		this.card.add(c1);
		this.card.add(c2);
		this.card.add(c3);
		this.card.add(c4);
		this.card.add(c5);
		this.card.add(c6);
	}
	public void addCard(Card c) {
		if(c.getCredit()==0) {
			CardCapacite cd=new CardCapacite(c.getName(), c.getCost(), c.getGain());
			this.card.add(cd);
		}
		else {
			CardCours cd=new CardCours(c.getName(), c.getCost(),c.getGain(), c.getCredit(), c.getCategorie(), c.getFiliereCours());
			this.card.add(cd);
		}
			
		
	}
	public void removeCard(Card c) {
		this.card.remove(c);
	}
	public Card getCard(int index){
		return this.card.get(index);
	}
	public void showCard() {
		String s=new String("No.\t|Cours\t|\t"+" "+" "+" "+"Cost\t\t\t|\tGain\t\t|Credit\t|Categorie\t|**\n\t\t|Math\t|Langage|Info\t|Argent\t|Math\t|Langage|Info\t|\t|\t\t|\n");
		s+="#1\t"+card.get((int)(Math.random()*5/1));
		s+="#2\t"+card.get((int)(Math.random()*5/1));
		s+="#3\t"+card.get((int)(Math.random()*5/1));
		s+="#4\t"+card.get((int)(Math.random()*5/1));
		s+="#5\t"+card.get((int)(Math.random()*5/1));
		s+="#6\t"+card.get((int)(Math.random()*5/1));
		System.out.println(s);
	}
	public static void main(String[] args) {
		CardManagement cm=new CardManagement();
		cm.initial();
		System.out.println(cm);
//		ArrayList<Integer> a=new ArrayList<Integer>();
//		a.add(1);
//		System.out.println(a);

	}

}
