package source;

import java.util.ArrayList;

public class ProvenanceDeEtudiant {
	private String name;
	private int[] capacite;
	private ArrayList<Age> annee=new ArrayList<Age>();
	public ProvenanceDeEtudiant(String name, int[] capacite, Age a1,Age a2,Age a3) {
		super();
		this.name = name;
		this.capacite = capacite;
		this.annee.add(a1);
		this.annee.add(a2);
		this.annee.add(a3);
	}
	public String toString(){
		String s=new String("Provenance:"+name+"\n"+"\t|\t"+"Cost\t\t|\t"+" "+" "+" "+" "+" "+" "+"Gain\t\t|Credit\t|Status\n\t|Math\t|Langage|Info\t|Math\t|Langage|Info\t|Argent\t|\n"+
	annee.get(0)+annee.get(1)+annee.get(2)+"\n");
		return s;
	}
	public int[] getCapacite() {
		return capacite;
	}
	public Age getAge(int n){
		return annee.get(n);
	}
}
