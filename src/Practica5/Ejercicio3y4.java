package Practica5;

public class Ejercicio3y4 {
	
	public static void main(String[] args) {
		String str = new String("Sergio");
		String str2 = new String("Navarro");
		String str3 = new String();
		int vocales, espacios;
		str3 = str + " " + str2;
	    System.out.println("cadena str : "+ str3);
	    str.contains("a,e");
	    
	    String cadena = new String("esto es una prueba de una clase string");
	    vocales = contadorVocales(cadena);
	    espacios = contadorEspacios(cadena);
	    System.out.println("la cadena tiene " + vocales + " vocales y "+ (cadena.length() - (vocales + espacios)) + " consonantes");
	}
	
	public static int contadorVocales(String cadena) {
		int contador = 0;
		
		for(int x=0; x < cadena.length(); x++) {
				
            if ("a".equalsIgnoreCase(cadena.substring(x,x+1)) || "e".equalsIgnoreCase(cadena.substring(x,x+1))  || "i".equalsIgnoreCase(cadena.substring(x,x+1))  ||
            		"o".equalsIgnoreCase(cadena.substring(x,x+1)) ||"u".equalsIgnoreCase(cadena.substring(x,x+1))) {
            	contador++;
            }
		}	
			
		return contador;
	}

	public static int contadorEspacios(String cadena) {
		int contador = 0;
		
		for(int x=0; x < cadena.length(); x++) {
				
            if (" ".equals(cadena.substring(x,x+1))) contador++;
		}	
			
		return contador;
	}
}
