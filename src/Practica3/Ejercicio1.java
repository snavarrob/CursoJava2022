package Practica3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero;
		float modulo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		numero = sc.nextInt();
		modulo = numero%2;
		if (modulo == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		sc.close();
	}

}
