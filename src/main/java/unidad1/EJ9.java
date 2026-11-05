package unidad1;

import java.util.Scanner;

public class EJ9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double tasaCambio = 1.08; // Ejemplo de conversión aproximada
        
        System.out.print("Introduce la cantidad en euros (€): ");
        double euros = scanner.nextDouble();
        
        double dolares = euros * tasaCambio;
        System.out.printf("Equivale a: $%.2f dólares%n", dolares);
        scanner.close();
    }
}