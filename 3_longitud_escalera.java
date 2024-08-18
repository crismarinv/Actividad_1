package ejercicios2_3;

import java.util.Scanner;

public class Main {

	// Creamos la funcion que calcula la longitud de la escalera
    public static double calcularLongitudEscalera(double altura, double anguloGrados) {
        // Se debe convertir el ángulo de grados a radianes
        double anguloRadianes = Math.toRadians(anguloGrados);
        
        // Calculamos la longitud de la escalera usando la fórmula
        double longitudEscalera = altura / Math.sin(anguloRadianes);
        
        return longitudEscalera;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos la altura de la escalera (x)
        System.out.print("Ingrese la altura de la escalera (en metros): ");
        double altura = scanner.nextDouble();

        // Solicitamos el ángulo de inclinación (α)
        System.out.print("ingrese el ángulo de inclinación (en grados): ");
        double angulo = scanner.nextDouble();

        // Calculamos la longitud de la escalera
        double longitudEscalera = calcularLongitudEscalera(altura, angulo);

        // Se muestra ahora el resultado
        System.out.printf("La longitud de la escalera es: %.2f metros\n", longitudEscalera);
        
        scanner.close();
    }}


