package Laporan6utama;
import Laporan6.Becak;
import Laporan6.Odong2;

public class Bentor {
	
	public Becak becak1;
	public Odong2 odong1;
	private int nomor;
	protected String nama;
	
	public Bentor() {
		becak1=new Becak();
		odong1=new Odong2();
		System.out.println("Konstruktor Bentor");
	}
	
	public void stater() {
		System.out.println("Tarik Bentor");
	}
	
	public Bentor(String nama) {
		this.nama = nama;
	}
	
}
