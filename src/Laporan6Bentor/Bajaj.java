package Laporan6Bentor;
import Laporan6utama.Bentor;

public class Bajaj extends Bentor {
	
	public String nama;
	
	public Bajaj() {
		super();
	}
	
	public Bajaj(String nama) {
		super(nama);
	}
	
	public void cetak (String nama) {
		super.nama = nama;
		this.nama = "Bajaj lokal";
		
		System.out.println(nama);
		System.out.println(this.nama);
	}
	
	public static void main(String args[]) {
			Bajaj bajaj = new Bajaj();
			bajaj.cetak("Bajaj kuuu");
	}
	
	public void stater() {
		System.out.println("Tarik Bajaj");
	}
}
