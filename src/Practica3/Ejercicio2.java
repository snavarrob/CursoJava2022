package Practica3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		

		float t1,t2,t3,total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nota trimestre 1");
		t1 = sc.nextFloat();
		System.out.println("Introduce nota trimestre 2");
		t2 = sc.nextFloat();
		System.out.println("Introduce nota trimestre 3");
		t3 = sc.nextFloat();
		total = (t1+t2+t3)/3;
		if (total > 7) {
			System.out.println("Enhorabuena,Has aprobado");
		}
		else {
			System.out.println("Lo siento no has aprobado");
		}
		sc.close();
	}

}
