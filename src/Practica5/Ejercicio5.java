package Practica5;

public class Ejercicio5 {

	public static void main(String[] args) {
			String email = new String("gcasas1972@gmail.com");
			int arroba = email.lastIndexOf("@");
			System.out.println("La arroba esta en la posicion " + arroba);
			System.out.println("las dos subcadenas son " + email.substring(0,arroba--) + " " + email.substring(arroba+=2, email.length()));
	}

}
