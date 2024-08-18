package ejercicios2_5;

import java.util.Scanner;

public class Main {

	// Función que calcula el área de un círculo dado su radio
    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Función que calcula el área de la corona circular usando la función anterior
    public static double areaCoronaCircular(double radioMayor, double radioMenor) {
        return areaCirculo(radioMayor) - areaCirculo(radioMenor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los radios
        System.out.print("Ingrese el radio menor (r) de la figura: ");
        double radioMenor = scanner.nextDouble();

        System.out.print("Ingrese el radio mayor (R) de la figura: ");
        double radioMayor = scanner.nextDouble();

        // Cálculo y muestra del área de la corona circular
        double areaCorona = areaCoronaCircular(radioMayor, radioMenor);
        System.out.println("El área de la corona circular es: " + areaCorona);
        
        scanner.close();
    }
}
