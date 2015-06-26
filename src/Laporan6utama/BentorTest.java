package Laporan6utama;
import Laporan6Bentor.Bajaj;
import Laporan6Bentor.Motor;

public class BentorTest {
	
	public static void staterBentor(Bentor bentor) {
		bentor.stater();
	}
	
	public static void main(String args[])
	{
		Bentor bajaj = new Bajaj();
		Motor motor = new Motor();
		
		staterBentor(new Bentor());
		
		staterBentor(bajaj);
		
		staterBentor(motor);
	}
}
