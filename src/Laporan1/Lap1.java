
package Laporan1;

public class Lap1 {

	public static String str="isna";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		perkalian(); //pemanggilan fungsi perkalian
		pembagian(); //pemanggilan fungsi pembagian
		penjumlahan(); //pemanggilan fungsi penjumlahan
		pengurangan(); //pemanggilan fungsi pengurangan
		biodata(); //pemanggilan fungsi biodata
		//test();//pemanggilan fungsi test

	}
	
	//perkalian
	public static void perkalian() 
	{
		int a = 54; //tipedata dan nilainya
		int b = 23; //tipedata dan nilainya
		System.out.println(" Hasil perkalian " + a*b); //menampilkan hasil perkalian
	}
	
	//pembagian
	public static void pembagian()
	{
		float c = 1000; //tipedata dan nilainya
		float d = 35; //tipedata dan nilainya
		System.out.println(" Hasil pembagian " + c/d);  //menampilkan hasil pembagian
	}
	
	//pengurangan
	public static void pengurangan()
	{
		int e = 94303; //tipedata dan nilainya
		int f = 4545; //tipedata dan nilainya
		System.out.print(" Hasil Pengurangan "+e+" - "+f+" = ");  //menampilkan hasil pengurangan
        System.out.println(e-f);
	}
	
	//penjumlahan
	public static void penjumlahan()
	{
		int g = 104939; //tipedata dan nilainya
		int h = 889; //tipedata dan nilainya
		System.out.print(" Hasil Penjumlahan "+g+" + "+h+" = ");  //menampilkan hasil penjumlahan
        System.out.println(g+h);
	}
	
	//biodata
	public static void biodata()
	{
		String nama="Isnaeni";
		String nim="60200112044";
		String kelas="C";
		System.out.println(" Nama saya adalah " + nama  + " nimku " + nim  + " kelas " + kelas);
	}
	

}
