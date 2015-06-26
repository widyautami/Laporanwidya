package Laporan4;

public class SwitchCase {
	public static void main(String args[])
	{
		int angka=13;
		switch (angka) {
		case 1: 
			System.out.println("Angka tersebut bernilai 1"); 
			break; 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
			System.out.println("Angka tersebut bernilai 2, 3, 4, atau 5"); 
			break; 
		case 6: 
		case 7: 
		case 8: 
			System.out.println("Angka tersebut bernilai 6, 7, atau 8"); 
			break; 
		default: 
			System.out.println("Angka tersebut tidak bernilai 1 - 8"); 
		}
	}

}
