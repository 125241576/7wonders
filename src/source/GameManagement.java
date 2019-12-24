package source;

import java.util.ArrayList;
import java.util.Scanner;

public class GameManagement {
	
	public static void main(String[] args) {
		ProvenanceDeEtudiantManagement pdem=new ProvenanceDeEtudiantManagement();
		Player player1=new Player("xhh",pdem.getProvenanceDeEtudiant(0));
		Player player2=new Player("zrq",pdem.getProvenanceDeEtudiant(1));
		Player player3=new Player("fjw",pdem.getProvenanceDeEtudiant(2));
		CardManagement cm=new CardManagement();
		cm.initial();
		Scanner in=new Scanner(System.in);
		player1.addCard(cm.getCard(14));
		player1.addCard(cm.getCard(1));

		System.out.println(player1);
//		for(int i=0;i<7;i++) {
//			System.out.println(player1);
//			cm.showCard();
//			System.out.println("Enter number or \"g\"(give up draw a card) ");
//			boolean judge=true;
//			while(true) {
//				switch (in.nextLine()) {
//				case "1":	
//					judge=false;
//					break;
//				case "2":	
//					judge=false;
//					break;
//				case "3":
//					judge=false;
//					break;
//				case "4":
//					judge=false;
//					break;
//				case "5":
//					judge=false;
//					break;
//				case "6":
//					judge=false;
//					break;
//				case "g":
//					player1.earnMoney();
//					judge=false;
//					break;
//				default :	System.out.println("Input Error!");
//				}
//			}
			
			
			
			
		//}
	}
}
