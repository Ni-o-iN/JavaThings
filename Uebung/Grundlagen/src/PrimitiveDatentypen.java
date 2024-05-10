public class PrimitiveDatentypen {

	public static void main(String[] args) {
		byte a = 100; // byte ist 8 bit gro�, also von -128 bis 127
		short b = 10000; //short ist 16 bit gro�, also von -32768 bis 32767 
		int c = 1000000000; //int = integer ist 32 bit gro�, also von -2147483648 bis 2147483647
		long d = 1000000000; //long ist 64 bit gro�, also von -9223372036854775808 bis 9223372036854775807
		float e = 5.55f; //float macht Gleitkommazahlen bis 32 bit (einfache Genauigkeit)
		double f = 5.5555d; //double macht Gleitkommazahlen bis 64 bit (doppelte Genauigkeit)
		char g = 'a'; //char besitzt einzelne Buchstaben
		boolean h = true; // boolean kann entweder flase oder true sein
		
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + g + ", " + h);
	}

}
