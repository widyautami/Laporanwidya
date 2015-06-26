package Laporan7Model;

public abstract class Segitiga extends Model {
	
	protected float alas;
	protected float tinggi;
	
	public Segitiga() {
		alas = 5;
		tinggi = 5;
	}
	
	public float hitungLuas() {
		return (alas * tinggi/2);
	}

}
