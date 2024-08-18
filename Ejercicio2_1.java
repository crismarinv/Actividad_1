package ejercicios2_1;

public class Ejercicio2_1 {


    // Primero definimos f (x, y)
    public static int f(int x, int y) {
        return x * x + 2 * x * y + y * y;
    }

    public static void main(String[] args) {
        // Ingresamos x, y como 3, 4 (variables de entrada), pero son modificables
        int x = 3;
        int y = 4;
        
        // Llamamos a la función f(x, y) y se almacena el resultado
        int resultado = f(x, y);
        
        // Que muestre el resultado
        System.out.println("El valor de f(" + x + ", " + y + ") es: " + resultado);
    }


}
