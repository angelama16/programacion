package unidad3_arrays;

import java.util.Arrays;
import java.util.Random;

public class EJ02 {

//	public static void main(String[] args) {
//	Random r = new Random();
//	int tamaño = r.nextInt(41) + 10;
//	int v[] = new int[tamaño];
//	for (int i=0; i<v.length; i++) {
//		int valor = 0;
//		boolean seRepite;
//		do {
//			valor = r.nextInt(201) - 100;
//			seRepite = false;
//			// comprobar si se repite (entonces seRepite pasa de false a true)
//			for (int j=0; j<i; j++)
//				if (v[j] == valor) {
//					seRepite = true;
//					break;
//				}
//		} while (seRepite);
//		v[i] = valor;
//	}
//	System.out.println(Arrays.toString(v));
//}

//public static void main(String[] args) {
//	Random r = new Random();
//	int tamaño = r.nextInt(41) + 10;
//	int v[] = new int[tamaño];
//	for (int i=0; i<v.length; i++) {
//		Integer valor = null;
//		while (valor == null) {
//			valor = r.nextInt(201) - 100;
//			for (int j=0; j<i; j++)
//				if (v[j] == valor) {
//					valor = null;
//					break;
//				}
//		}
//		v[i] = valor;
//	}
//	System.out.println(Arrays.toString(v));
//}

	static Random r = new Random();

	public static void main(String[] args) {
		int tamaño = r.nextInt(11) + 10;
		int v1[] = new int[tamaño];
		for (int i = 0; i < v1.length; i++) {
			v1[i] = obtenerValorSinRepetir(v1, i);
		}
		int[] v2 = new int[v1.length];
		for (int i = 0; i < v1.length; i++) {
			v2[v2.length - i - 1] = v1[i];
		}
		System.out.println(Arrays.toString(v1));
		System.out.println(Arrays.toString(v2));
	}

	static int obtenerValorSinRepetir(int[] v, int i) {
		Integer valor = null;
		while (valor == null) {
			valor = r.nextInt(201) - 100;
			for (int j = 0; j < i; j++)
				if (v[j] == valor) {
					valor = null;
					break;
				}
		}
		return valor;
	}

}
