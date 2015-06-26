package Laporan2;

public class Lap2 {
	static boolean bool;
	static byte by;
	static char ch;
	static double d;
	static float f;
	static int i;
	static long l;
	static short sh;
	static String stri;
	
	static char c = 0xffff;
	static byte b = 0x7f;
	static short s = 0x7fff;
	static int i1 = 0x2f;
	static int i2 = 0x2f;
	static int i3 = 0177;
	static long n1 = 200L;
	static long n2 = 200l;
	static long n3 = 200;
	static float f1 = 1;
	static float f2 = 1F;
	static float f3 = 1f;
	static float f4 = 1e-45f;
	static float f5 = 1e+9f;
	static double d1 = 1d;
	static double d2 = 1D;
	static double d3 = 47e47d;
	
	static String \u0073\u0074\u0072="\u004Aa\u0076a";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		i+=5;
		
		if  (i==3)
		{
			if (bool=true)
				{
					System.out.println("bool="  + bool);
					System.out.println("by =" +by);
					System.out.println("ch=" + ch);
					System.out.println("d=" + d);
				}
				else
				{
					System.out.println("f=" + f);
					System.out.println("i=" + i);
					System.out.println("l=" + l);
					System.out.println("sh=" + sh);
					System.out.println("str=" + stri);
					objek();
				}
		}
		else if (stri==null)
		{
			System.out.println("char=" + c);
			System.out.println("byte =" + b);
			System.out.println("short=" + s);
			System.out.println("int i1=" + i1);
			System.out.println("int i2=" + i2);
			System.out.println("int i3=" + i3);
			System.out.println("long n1=" + n1);
			System.out.println("long n2=" + n2);
			System.out.println("long n3=" + n3);
			System.out.println("float f1=" + f1);
			System.out.println("float f2=" + f2);
			System.out.println("float f3=" + f3);
			System.out.println("float f4=" + f4);
			System.out.println("float f5=" + f5);
			System.out.println("double d1=" + d1);
			System.out.println("double d2=" + d2);
			System.out.println("double d3=" + d3);
			
			System.out.println("S\u00ED se\u00F1or");
			System.out.println(str);
		}
	}

	
	public static void objek(){
		Boolean refBoolean = new Boolean(true);
		boolean bool = refBoolean.booleanValue();
		
		Byte refByte = new Byte((byte) 123);
		byte b = refByte.byteValue();
		
		Character refChar = new Character('x');
		char c = refChar.charValue();
		
		Short refShort = new Short((short) 123);
		short s = refShort.shortValue();
		
		Integer refInt = new Integer(123);
		int i = refInt.intValue();
		
		Long refLong = new Long(123L);
		long l = refLong.longValue();
		
		Float refFloat = new Float(12.3F);
		float f = refFloat.floatValue();
		
		Double refDouble = new Double(12.3D);
		double d = refDouble.doubleValue();
		
		System.out.println("Boolean=" + bool);
		System.out.println("byte =" + b);
		System.out.println("Character=" + c);
		System.out.println("short=" + s);
		System.out.println("int =" + i);
		System.out.println("long=" + l);
		System.out.println("float=" + f);
		System.out.println("double=" + d);
	}

}
