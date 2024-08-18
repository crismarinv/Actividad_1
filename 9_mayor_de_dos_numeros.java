package ejercicios2_9;

import java.util.Scanner;

public class Main {

	//Creamos la funcion que encontrara el numero mayo de dos enteros
	public static int Mayor_de_dos(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		//Pedimos que ingresen los valores y necesitamos que sean leidos con scanner
		System.out.print("Ingrese el primer numero entero: ");
		int numero1 = scanner.nextInt();
		System.out.print("Ingrese el segundo numero entero: ");
		int numero2 = scanner.nextInt();
		
		//Ahora usamos la funcion que habiamos creado anteriormente
		int mayor = Mayor_de_dos(numero1, numero2);
		
		//Y que se imprima
		System.out.println("El mayor de los dos numeros es: " + mayor);
		
	scanner.close();
}

}
