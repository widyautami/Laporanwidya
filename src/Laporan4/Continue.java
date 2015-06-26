package Laporan4;

public class Continue {
	public static void main(String args[]) 
	{ 
		int i=0; 
		do 
		{ 
			i++; 
			if (i==3) continue; 
			System.out.println("Perulangan ke : "+i); 
			if (i==5) break; 
		 } 
		while(i <= 9); 
	} 

}
