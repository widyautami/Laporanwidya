package Laporan7Model;

public class BujurSangkar extends Model {
	
	private float sisi;
	
	public BujurSangkar() {
		sisi = 5;
	}
	
	public float hitungLuas() {
		return sisi*sisi;
	}
	
	public void tulis() {
		System.out.println("Bujur Sangkar");
	}


}
