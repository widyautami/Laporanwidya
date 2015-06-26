package Laporan5;

public class Handphone {
	public static void main(String[] args)
	{
		Handphone objekHandphone = new Handphone();
		Mobil objekMobil = null;
		if (objekHandphone instanceof Handphone)
		{
			System.out.println("Objek Handphone adalah instan dari kelas" + "Handphone");
		}
		if (objekMobil == null)
		{
			System.out.println("objek mobil belum diinstansiasi");
		}
	}

}

//class Mobil {
//	
//}
