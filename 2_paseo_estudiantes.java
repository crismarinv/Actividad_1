package ejercicios2_2;

import java.util.Scanner;

public class Main {

	    // Creamos la función que calcula el número de buses que necesitamos
	    public static int calcularNumeroBuses(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
	        // Calcula el total de sillas ocupadas
	        int sillasOcupadas = (estudiantesGordos * 2) + estudiantesFlacos;
	        
	        // Calculemos el número de buses requeridos
	        int numeroDeBuses = sillasOcupadas / sillasPorBus;
	        
	        // Si sobra algo, es necesario un bus adicional
	        if (sillasOcupadas % sillasPorBus != 0) {
	            numeroDeBuses++;
	        }
	        
	        return numeroDeBuses;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Solicitamos al usuario que ingrese los datos requeridos
	        System.out.print("Ingrese el número de sillas disponibles por bus: ");
	        int sillasPorBus = scanner.nextInt();
	        
	        System.out.print("Ingrese el número de estudiantes gordos: ");
	        int estudiantesGordos = scanner.nextInt();
	        
	        System.out.print("Ingrese el número de estudiantes flacos: ");
	        int estudiantesFlacos = scanner.nextInt();
	        
	        // Calculamos el número de buses que necesitamos
	        int numeroDeBuses = calcularNumeroBuses(sillasPorBus, estudiantesGordos, estudiantesFlacos);
	        
	        // Se muestra el resultado de buses requeridos
	        System.out.println("El número de buses requeridos es: " + numeroDeBuses);
	        
	        scanner.close();
	    }


	}

