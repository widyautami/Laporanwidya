package Laporan7;
import Laporan7Model.Model;
import Laporan7Model.BujurSangkar;
import Laporan7Model.SegitigaSamaKaki;
import Laporan7Model.SegitigaSamaSisi;

public class CobaBentuk {
	
	public static void cetakBangun(Model b) {
		
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}
	
	public static void main(String args[]) {
		
		cetakBangun(new BujurSangkar());
		cetakBangun(new SegitigaSamaKaki());
		cetakBangun(new SegitigaSamaSisi());
	}
}
