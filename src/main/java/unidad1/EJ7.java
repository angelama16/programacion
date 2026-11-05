package unidad1;

import java.util.Scanner;

public class EJ7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double v0 = 5.0; // m/s
        double a = 2.0;  // m/s^2
        
        System.out.print("Introduce el tiempo transcurrido en segundos: ");
        double t = scanner.nextDouble();
        
        double espacio = (v0 * t) + (0.5 * a * Math.pow(t, 2));
        System.out.printf("El espacio recorrido es: %.2f metros%n", espacio);
        scanner.close();
    }
}