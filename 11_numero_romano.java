package ejercicios2_11;


public class Main {

	// Primero creamos la funcion que generara la cifra de las decenas de un número de dos cifras
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    // Ahora la funcion que nos da la cifra de las unidades de un número de dos digitos
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    //  Necesitamos ahora convertir a numero romano, primero 1 cifra
    public static String convertirUnidadARomano(int numero) {
        switch (numero) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return ""; 
            // Este ultimo seria para el 0
        }
    }

    // Ahora con las decenas
    public static String convertirDecenaARomano(int numero) {
        switch (numero) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
            default: return ""; 
            
        }
    }

    // Generamos la funcion principal
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Ingrese un número entero entre 1 y 99: ");
        int numero = scanner.nextInt();
        
        if (numero < 1 || numero > 99) {
            System.out.println("Error: El número debe estar entre 1 y 99.");
        } else {
            int decenas = obtenerDecenas(numero);
            int unidades = obtenerUnidades(numero);
            
            String romanoDecenas = convertirDecenaARomano(decenas);
            String romanoUnidades = convertirUnidadARomano(unidades);
            
            System.out.println("El número en romano es: " + romanoDecenas + romanoUnidades);
            
            scanner.close();
        }
	
	
}
}
