package Laporan4;

public class If_else 
{
	
	public static void main (String[] args)
	{
		int usia = 50;
		String tipe;
		
		if (usia<11) 
		{
			tipe = "Anak";
		}
		else if (usia<23) 
		{
			tipe = "Remaja";
		}
		else if (usia<50) 
		{
			tipe = "Dewasa";
		}
		else 
		{
			tipe = "Lansia";
		}
		System.out.println("Tipenya adalah = " + tipe);
	}

}
