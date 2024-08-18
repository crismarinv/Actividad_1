package ejercicios2_7;

import java.util.Scanner;

public class Main {
	
	// Función para calcular la distancia entre dos puntos
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

    // Función para calcular la pendiente de la recta que une dos puntos
    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos ingresar las coordenadas del primer punto
        System.out.print("Ingrese x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese y1: ");
        double y1 = scanner.nextDouble();

        // Ahora las coordenadas del segundo punto
        System.out.print("Ingrese x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese y2: ");
        double y2 = scanner.nextDouble();

        // Y ya tenemos para calcular la distancia y la pendiente
        double distancia = calcularDistancia(x1, y1, x2, y2);
        double pendiente = calcularPendiente(x1, y1, x2, y2);

        // Imprimimos los resultados
        System.out.println("La distancia entre los dos puntos es: " + distancia);
        System.out.println("La pendiente de la recta que une los dos puntos es: " + pendiente);
        
        scanner.close();
    }
}