package ejercicios2_10;

import java.util.Scanner;


public class Main {



	    // Generamos la funcion que realiza la operación aritmetica según el operador dado
	    public static double calculadora(int num1, int num2, String operador) {
	        double resultado;

	        switch (operador) {
	            case "+":
	                resultado = num1 + num2;
	                break;
	            case "-":
	                resultado = num1 - num2;
	                break;
	            case "*":
	                resultado = num1 * num2;
	                break;
	            case "/":
	                if (num2 != 0) {
	                    resultado = (double) num1 / num2;
	                } else {
	                    throw new ArithmeticException("División por cero no permitida");
	                }
	                break;
	            case "%":
	                resultado = num1 % num2;
	                break;
	            case "**":
	                resultado = Math.pow(num1, num2);
	                break;
	            default:
	                throw new IllegalArgumentException("El operador ingresado no es válido, debe utilizar alguno de los permitidos (+, -, *, /, %, **)");
	        }

	        return resultado;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Leer los dos números enteros
	        System.out.print("Ingrese el primer número: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Ingrese el segundo número: ");
	        int num2 = scanner.nextInt();

	        // Leer el operador
	        System.out.print("Ingrese el operador (+, -, *, /, %, **): ");
	        String operador = scanner.next();

	        try {
	            // Usando la funcion calculadora se muestra el resultado
	            double resultado = calculadora(num1, num2, operador);
	            System.out.println("El resultado es: " + resultado);
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        scanner.close();
	    }
	}