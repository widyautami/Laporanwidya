package Laporan4;

public class Perulangan {

	public static void main (String[] args) {
		char jeniskelamin='w';
		//nested if
		if (jeniskelamin=='L')
			System.out.println("Cowok");
		else if (jeniskelamin=='P')
			System.out.println("Cewek");
		else
			System.out.println("Banci");

	//tenary
			System.out.println(jeniskelamin=='P'? "Dia Pasti Cowok." : "Dia Pasti Cewek");

	//switch case
	switch (jeniskelamin){
		case 'L' : System.out.println("Cowok");
		break;
		case 'P' : System.out.println("Cewek");
		break;
		default : System.out.println("Banci");
		break;
		}
	}
}
