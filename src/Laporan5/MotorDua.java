package Laporan5;

public class MotorDua {
	
	private String namaMotor;
	private int hargaMotor;
	
	private MotorDua()
	{
		namaMotor = "MIO J";
		hargaMotor=14500000;
	}

	private MotorDua(String nama, int harga){
		namaMotor = nama;
		hargaMotor = harga;
	}
	
	public void cetakMotorDua() {
		System.out.println(namaMotor + " " + hargaMotor);
	}
	
	public static void main(String args[]) {
		MotorDua mDua = new MotorDua();
		mDua.cetakMotorDua();
		mDua = new MotorDua("Sanex", 2000000);
		mDua.cetakMotorDua();
	}

}
