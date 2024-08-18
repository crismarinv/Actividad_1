package ejercicios2_13;

import java.util.Scanner;

public class Main {

	// Primero calculamos el valor del aumento según el salario actual con la siguiente funcion
    public static double calcularAumento(double salarioActual) {
        double aumento = 0.0;

        if (salarioActual <= 800000) {
            aumento = salarioActual * 0.10;  // este seria para un aumento odel 10%
        } else if (salarioActual > 800000 && salarioActual <= 1200000) {
            aumento = salarioActual * 0.08;  // este para un 8% de aumento
        } else {
            aumento = salarioActual * 0.05;  // y este para un 5%
        }

        return aumento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos ingresar el salario actual
        System.out.print("Ingrese el salario actual del empleado: ");
        double salarioActual = scanner.nextDouble();

        // Calculamos el aumento
        double aumento = calcularAumento(salarioActual);

        // Y ahora el nuevo salario
        double nuevoSalario = salarioActual + aumento;

        // Se imprime el resultado
        System.out.println("El valor del aumento es: " + aumento);
        System.out.println("El nuevo salario es: " + nuevoSalario);

        scanner.close();
    }
}