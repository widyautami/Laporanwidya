package Laporan6Bentor;

import Laporan6.Odong2;
import Laporan6.Becak;
import Laporan6utama.Bentor;

public class Motor extends Bentor {
	
	public Motor() {
		
	}
	
	public void balap() {
		Odong2 Odong2 = new Odong2();
		stater();
		nama = "Motor isna";
		System.out.println("Balappppp ");
	}

	public static void main(String args[]) {
		Motor motor = new Motor();
		motor.balap();
	}
	
	public void stater() {
		System.out.println("Tarik motor");
	}
}
