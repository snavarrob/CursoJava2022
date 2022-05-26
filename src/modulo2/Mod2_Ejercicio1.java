package modulo2;

public class Mod2_Ejercicio1 {

	public static void main(String[] args) {
		byte bmin = Byte.MIN_VALUE;
		byte bmax = Byte.MAX_VALUE;
		short smin = Short.MIN_VALUE;
		short smax = Short.MAX_VALUE;
		int imin = Integer.MIN_VALUE;
		int imax = Integer.MAX_VALUE;
		long lmin = Long.MIN_VALUE;
		long lmax = Long.MAX_VALUE;
		System.out.println("tipo\tminimo\tmaximo");
		System.out.println("....\t......\t......");
		System.out.println("\nbyte\t" + bmin + "\t" + bmax);
        System.out.println("\nshort\t" + smin + "\t" + smax);
        System.out.println("\nint\t" + imin + "\t" + imax);
        System.out.println("\nlong\t" + lmin + "\t" + lmax);
        
    	char division = 'A';
    	byte goles = 7;
    	int capacidad = 80000;
    	double promedio = 7/90;
    	System.out.println("division\tgoles\tcapacidad\tpromedio");
    	System.out.println(division + "\t\t " + goles + "\t   " + capacidad + "\t  "  + promedio);
    	
    	byte b = 0;
    	short s = 25;
    	int i = 1200;
    	long l = 0;
    	
    	b=(byte)s;
    	l=i;
    	b=(byte)i;
    	s=(short)i;
    	
    	System.out.println("\n\nlong = " + l + " integer = " + i + " short = " + s + " byte = " + b );
    	
    	
	}

}
