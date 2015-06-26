package Laporan7Model;

public abstract class Model {

	protected int a;
	protected int b;
	
	public void geser(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("a = " + a + "b = " + b);
	}
	
	public abstract float hitungLuas();
	public abstract void tulis();
	
}
