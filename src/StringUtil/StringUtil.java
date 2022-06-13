package StringUtil;

import StringUtil.IStringUtil;
public class StringUtil{

	public static void main(String[] args) {
		
		String str = new String("Esto es una prueba de string util  ");
        System.out.println("la cadena contiene doble espacio "+ containsDobleSpace(str));
        System.out.println("la cadena contiene numeros "+ containsNumber(str));		
	}
	
	public static boolean containsDobleSpace(String str) {
		boolean dobleEspacio;
		int i;
		CharSequence cadena = "  ";
    	dobleEspacio = str.contains(cadena);
    	return dobleEspacio;
	}
	
	public static boolean containsNumber(String str) {
		boolean numero = false;
		char caracter;
		int i = 0;
		while (i < str.length() && !numero) {
			caracter = str.charAt(i);
			numero = Character.isDigit(caracter);
			i++;
		}
		
		return numero;
	}

}
