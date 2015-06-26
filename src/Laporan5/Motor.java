package Laporan5;

public class Motor {
	
		public void motor() {
			System.out.println("Sanex");
		}
		
		public void motor(String nama) {
			System.out.println("Mio");
		}
		
		public void motor(int jumlah) {
			System.out.println("Jupiter");
		}
		
		public void motor(long jumlah) {
			System.out.println("Shogun");
		}
		
		public String motor(String nama, int jumlah) {
			return "Scorpio";
		}
		
		public static void main (String args[]) {
			Motor motoran = new Motor();
			motoran.motor();
			motoran.motor("Vixion");
			motoran.motor("4");
			motoran.motor("51");
			System.out.println(motoran.motor("Motornya", 5));		
		}

	}
