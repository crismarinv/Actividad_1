package ejercicios2_8;

import java.util.Scanner;

public class Main {

	 // Función que calcula el número de salones necesarios
    public static int calcularSalones(int numEstudiantes, int capacidadSalon) {
        // Calculamos el número de salones necesarios
        return (int) Math.ceil((double) numEstudiantes / capacidadSalon);
    }

    // Función que calcula el número de pisos necesarios
    public static int calcularPisos(int numSalones, int salonesPorPiso) {
        // Calculamos el número de pisos necesarios
        return (int) Math.ceil((double) numSalones / salonesPorPiso);
    }

    // Función principal que usa las dos anteriores y solicita datos al usuario
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos ingresar el número de estudiantes
        System.out.print("Digite el número de estudiantes de la universidad: ");
        int numEstudiantes = scanner.nextInt();

        // Ahora la capacidad de cada salón
        System.out.print("Digite la capacidad de un salón (número de estudiantes por salón): ");
        int capacidadSalon = scanner.nextInt();

        // Solicitamos el número de salones por piso
        System.out.print("Digite el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        // Con esto ya podemos calcular el número de salones y pisos
        int numSalones = calcularSalones(numEstudiantes, capacidadSalon);
        int numPisos = calcularPisos(numSalones, salonesPorPiso);

        // Mostrar los resultados
        System.out.println("Número total de salones necesarios: " + numSalones);
        System.out.println("Número total de pisos necesarios: " + numPisos);
    
	
	scanner.close();
    }
}
