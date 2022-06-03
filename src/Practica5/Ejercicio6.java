package Practica5;

public class Ejercicio6 {

	public static void main(String[] args) {
		String cadena = new String("la cadena contiene  numero");
		boolean existsNumber = false;
		int i = 0;
		while (!existsNumber && i <= cadena.length())  {
			String s = String.valueOf(i);
			existsNumber = cadena.contains(s);
			i++;
		}
		System.out.println("La cadena contiene numeros : " + existsNumber);
	}

}
