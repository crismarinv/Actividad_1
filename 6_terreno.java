package ejercicios2_6;

import java.util.Scanner;

public class Main {

    // Generamos la función para calcular el área de un rectángulo base x altura
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Ahora la función para calcular la hipotenusa de un triángulo rectángulo
    public static double hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    // Función para calcular el área de un triángulo
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Ahora calculamos el perímetro del terreno
    public static double perimetroTerreno(double A, double B, double C) {
        // Hipotenusa del triángulo pequeño
        double hipotenusa = hipotenusa(B, A - C);
        // Suma de los lados del terreno
        return A + B + C + hipotenusa;
    }

    // Calculamos el área total del terreno
    public static double areaTerreno(double A, double B, double C) {
        // Área del rectángulo
        double areaRectangulo = areaRectangulo(B, C);
        // Área del triángulo
        double areaTriangulo = areaTriangulo(B, A - C);
        // Área total
        return areaRectangulo + areaTriangulo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos ingresar las dimensiones del terreno una por una
        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de C: ");
        double C = scanner.nextDouble();

        // Ahora hacemos el cálculo del área y perímetro
        double area = areaTerreno(A, B, C);
        double perimetro = perimetroTerreno(A, B, C);

        // Mostrar los resultados
        System.out.println("El área del terreno es: " + area);
        System.out.println("El perímetro del terreno es: " + perimetro);

        scanner.close();
    }
}