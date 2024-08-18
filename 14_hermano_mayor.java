package ejercicios2_14;

import java.util.Scanner; // se debe importar scanner para que lea los datos ingresados por el usuario

public class Main {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

    // Se pide al usuario ingresar los nombres y las edades de los hermanos
	        
	        System.out.println("Ingrese el nombre del primer hermano:");
	        String nombre1 = scanner.nextLine();
	        
	        System.out.println("Ingrese la edad del primer hermano:");
	        int edad1 = scanner.nextInt();
	  
	        scanner.nextLine();  // Se debe limpiar el buffer, sino este leera el '\n' y saltará la entrada

	        System.out.println("Ingrese el nombre del segundo hermano:");
	        String nombre2 = scanner.nextLine();
	        
	        System.out.println("Ingrese la edad del segundo hermano:");
	        int edad2 = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.println("Ingrese el nombre del tercer hermano:");
	        String nombre3 = scanner.nextLine();
	        System.out.println("Ingrese la edad del tercer hermano:");
	        int edad3 = scanner.nextInt();
	        
	        // Ahora utilizando if else, buscamos el hermano mayor
	        
	        String nombreMayor;
	        
	        int edadMayor;

	        if (edad1 > edad2 && edad1 > edad3) {
	            nombreMayor = nombre1;
	            edadMayor = edad1;
	        } else if (edad2 > edad1 && edad2 > edad3) {
	            nombreMayor = nombre2;
	            edadMayor = edad2;
	        } else {
	            nombreMayor = nombre3;
	            edadMayor = edad3;
	        }

	        // Se muestra el nombre del hermano mayor
	        System.out.println("El hermano mayor es: " + nombreMayor + " con " + edadMayor + " años.");
	        
	        scanner.close();
	    }
	}
