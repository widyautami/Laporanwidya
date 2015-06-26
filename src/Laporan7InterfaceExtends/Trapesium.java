package Laporan7InterfaceExtends;

public class Trapesium {
	
	public interface BentukInterface {
		
		public static final double PHI = 3.14;
		public void tulis();
	}
	
	public interface HitungKeliling extends BentukInterface {
		public double hitungKeliling();
	}
	
	public interface HitungLuas extends BentukInterface {
		public double hitungLuas();
	}
	
	public class Lingkaran implements HitungKeliling, HitungLuas {
		private double jariJari;
		
			public lingkaran(double jariJari) {
				this.jariJari = jariJari;
			}
	}

}
