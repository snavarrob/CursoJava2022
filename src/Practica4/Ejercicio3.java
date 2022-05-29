package Practica4;


public class Ejercicio3 {

	public static void main(String[] args) {
        int x;
		for ( x = 1; x <= 9; x++) {
			System.out.println("la tabla de multiplicar del numero " + x);
			for(int i = 0; i < 9; i++) {
				System.out.println(x + " * " + i + " =" + x*i);
			}
		}
	}

}