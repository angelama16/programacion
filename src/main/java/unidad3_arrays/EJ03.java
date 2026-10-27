package unidad3_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EJ03 {
	static Random r = new Random();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		static int obtenerValorSinRepetir;
		int tamaño;
		do {
			System.out.println("Introduce el tamaño del vector:");
			tamaño = s.nextInt();
		} while (tamaño < 10 || tamaño > 1000000);
		int[] v = new int[tamaño];
		
		for (int i = 0; i < v.length; i++) {
            v[i] = obtenerValorSinRepetir(v, i, tamaño);
        }
		
	}
}