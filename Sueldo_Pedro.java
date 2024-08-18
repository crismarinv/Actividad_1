package ejercicios2_4;


	import java.util.Scanner;

	public class Main {

	    // Creamos la funcion que calcula el gasto en arriendo
	    public static double calcularGastoArriendo(double sueldo) {
	        return sueldo * 0.40;
	    }

	    // Ahora la funcion para calcular el gasto en comida
	    public static double calcularGastoComida(double sueldo) {
	        return sueldo * 0.15;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Usamos scanner para leer el sueldo de Pedro ingresado
	        System.out.print("Introduce el sueldo de Pedro: ");
	        double sueldo = scanner.nextDouble();

	        // Calculamos el gasto en arriendo y comida
	        double gastoArriendo = calcularGastoArriendo(sueldo);
	        double gastoComida = calcularGastoComida(sueldo);

	        // Ahora resolvemos la ecuacion
	        double dineroRestante = sueldo - (gastoArriendo + gastoComida);

	        // Resultados
	        System.out.println("Gasto en arriendo: $" + gastoArriendo);
	        System.out.println("Gasto en comida: $" + gastoComida);
	        System.out.println("Dinero restante: $" + dineroRestante);
	        
	        scanner.close();
	    }
	}
	
