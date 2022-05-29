package Practica3;

import java.util.Scanner;

public class Ejercicio3 {

	enum Mes {
		ENERO(31), FEBRERO(28), MARZO(31),ABRIL(30),MAYO(31),JUNIO(30),JULIO(31),AGOSTO(31),SEPTIEMBRE(30),OCTUBRE(31),NOVIEMBRE(30),DICIEMBRE(31);
	
		private int dias; 
		
		private Mes(int dias) { 
		    this.dias=dias;
		} 
		
		public int getDays() {
			return dias;
		}

	}	

	public static void main(String[] args) {

        System.out.println("Introduce el mes :"); 
        Scanner sc = new Scanner(System.in);
        String mesEntrado = sc.next().toUpperCase();
		Mes mes = Enum.valueOf(Mes.class, mesEntrado);
		System.out.println(mes + " tiene " + mes.getDays() + " dias");
		sc.close();
	}

}
