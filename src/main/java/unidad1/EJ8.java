package unidad1;

import java.util.Scanner;

public class EJ8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el radio del círculo: ");
		double r = scanner.nextDouble();

		double perimetro = 2 * Math.PI * r;
		double area = Math.PI * Math.pow(r, 2);

		System.out.printf("Perímetro: %.2f%n", perimetro);
		System.out.printf("Área: %.2f%n", area);
		scanner.close();
	}

}
