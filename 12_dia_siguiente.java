package ejercicios2_12;

import java.util.Scanner;

public class Main {

public static String siguienteDia(String dia) {
    // Convertir el nombre del día a minúsculas para evitar problemas con mayúsculas
    dia = dia.toLowerCase();

    switch (dia) {
        case "lunes":
            return "martes";
        case "martes":
            return "miércoles";
        case "miércoles":
        case "miercoles": //Opcion con tilde
            return "jueves";
        case "jueves":
            return "viernes";
        case "viernes":
            return "sábado";
        case "sábado":
        case "sabado": //Con tilde
            return "domingo";
        case "domingo":
            return "lunes";
        default:
            return "Día inválido"; //si no lo escriben correctamente
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce el nombre de un día:");
    String dia = scanner.nextLine();
    
    String siguienteDia = siguienteDia(dia);
    System.out.println("El día de mañana es: " + siguienteDia);
    
    scanner.close();
}
}