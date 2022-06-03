package Practica5;

public class Ejercicio1y2 {

	public static void main(String[] args) {
		String str = new String("Hola mundo");
		System.out.println("Texto : " + str);
		System.out.println("Texto en mayuculas: " + str.toUpperCase());
		System.out.println("Texto en mayuculas: " + str.toLowerCase());
		System.out.println("Reemplazo o por 2 : " + str.replace("o", "2"));

		int parte = 0;
		String str2 = new String("Curso de Java");	
		for (int x = 0; x < str2.length() ; x++) {
			System.out.println(str2.charAt(x));
		}
		

	}

}
