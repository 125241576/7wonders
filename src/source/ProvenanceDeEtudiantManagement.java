package source;

import java.util.ArrayList;
import java.util.Scanner;

public class ProvenanceDeEtudiantManagement {
	private ArrayList<ProvenanceDeEtudiant> pdem=new ArrayList<ProvenanceDeEtudiant>();
	public ProvenanceDeEtudiantManagement() {
		initial();
		
	}
	public void initial() {
		AgeManagement am=new AgeManagement();
		pdem.add(new ProvenanceDeEtudiant("Licence", new int[] {1,0,0}, am.getAge(0),am.getAge(1),am.getAge(2)));
		pdem.add(new ProvenanceDeEtudiant("BTC", new int[] {0,0,1}, am.getAge(3),am.getAge(4),am.getAge(5)));
		pdem.add(new ProvenanceDeEtudiant("DUT", new int[] {0,1,0}, am.getAge(6),am.getAge(7),am.getAge(8)));
	}
	public ProvenanceDeEtudiant getProvenanceDeEtudiant(int n) {
		return pdem.get(n);
	}

}
