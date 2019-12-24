package source;

import java.util.ArrayList;

public class AgeManagement {
	private ArrayList<Age> am=new ArrayList<Age>();
	public AgeManagement() {
		this.initial();
	}
	private void initial() {
		Age a1=new Age("TC", new int[] {2,0,0}, new int[] {2,0,0,0,3});
		Age a2=new Age("Branche", new int[] {0,3,0}, new int[] {0,3,0,6,0});
		Age a3=new Age("Filiere", new int[] {0,0,4}, new int[] {0,0,4,0,6});
		am.add(a1);
		am.add(a2);
		am.add(a3);
		
		Age b1=new Age("TC", new int[] {0,2,0}, new int[] {0,2,0,0,3});
		Age b2=new Age("Branche", new int[] {0,0,3}, new int[] {0,0,3,6,0});
		Age b3=new Age("Filiere", new int[] {4,0,0}, new int[] {4,0,0,0,6});
		am.add(b1);
		am.add(b2);
		am.add(b3);

		Age c1=new Age("TC", new int[] {0,0,2}, new int[] {0,0,2,0,3});
		Age c2=new Age("Branche", new int[] {3,0,0}, new int[] {3,0,0,6,0});
		Age c3=new Age("Filiere", new int[] {0,4,0}, new int[] {0,4,0,0,6});
		am.add(c1);
		am.add(c2);
		am.add(c3);
//		Age d1=new Age("TC", new int[] {1,2,0,0}, new int[] {1,2,0,2,3});
//		Age d2=new Age("Branche", new int[] {2,2,0,2}, new int[] {2,2,0,6,6});
//		Age d3=new Age("Filiere", new int[] {2,4,0,4}, new int[] {2,4,0,2,12});
//		
//		Age e1=new Age("TC", new int[] {1,0,2,0}, new int[] {1,0,2,2,3});
//		Age e2=new Age("Branche", new int[] {2,2,0,2}, new int[] {2,2,0,6,6});
//		Age e3=new Age("Filiere", new int[] {2,4,0,4}, new int[] {2,4,0,2,12});
//		
//		Age f1=new Age("TC", new int[] {0,1,2,0}, new int[] {0,1,2,2,3});
//		Age f2=new Age("Branche", new int[] {2,2,0,2}, new int[] {2,2,0,6,6});
//		Age f3=new Age("Filiere", new int[] {2,4,0,4}, new int[] {2,4,0,2,12});
	}
	public Age getAge(int n) {
		return am.get(n);
	}
}
