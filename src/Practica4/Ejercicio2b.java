package Practica4;

import java.util.Scanner;

public class Ejercicio2b {

	public static void main(String[] args) {

		int numero, resultado, suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 9");
		numero = sc.nextInt();
		System.out.println("la tabla de multiplicar del numero " + numero);
		
		for(int i = 0; i < 9; i++) {
			resultado = numero*i;
			System.out.println(numero + " * " + i + " = " + resultado);
			suma = suma + getSuma(resultado, 2);
		}
		
		System.out.println("La suma de los numeros pares es " + suma);
		sc.close();
		
	}
    
    public static int getSuma(int resultado, int operador2) {
    	int retorno = 0;
		float modulo = resultado%operador2;
		if (modulo == 0) {
			retorno = resultado;
		}
		return retorno;
    	
    }	
}
