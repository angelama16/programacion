package unidad1;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class eje {

	// Método m1: Extraer subcadenas repetidas SIN expresiones regulares
	public static ArrayList<String> m1(String s) {
		ArrayList<String> lista = new ArrayList<>();
		if (s == null || s.isEmpty()) {
			return lista;
		}
		int i = 0;
		while (i < s.length()) {
			int j = i;
			while (j < s.length() && s.charAt(j) == s.charAt(i)) {
				j++;
			}
			int longitud = j - i;
			if (longitud >= 2) {
				lista.add(s.substring(i, j));
			}
			i = j;
		}
		return lista;
	}

	// Método m2: Lo mismo usando la expresión regular (.)\1+
	public static ArrayList<String> m2(String s) {
		ArrayList<String> lista = new ArrayList<>();
		if (s == null) {
			return lista;
		}
		Matcher m = Pattern.compile("(.)\\1+").matcher(s);
		while (m.find()) {
			lista.add(m.group());
		}
		return lista;
	}

	// Método m3a: Valor máximo de las submatrices de 3x3
	public static Integer m3a(int[][] matriz) {
		if (matriz == null || matriz.length < 3 || matriz[0].length < 3) {
			return null;
		}
		Integer max = null;
		int filas = matriz.length;
		int columnas = matriz[0].length;

		for (int i = 0; i <= filas - 3; i++) {
			for (int j = 0; j <= columnas - 3; j++) {
				int suma = 0;
				for (int f = i; f < i + 3; f++) {
					for (int c = j; c < j + 3; c++) {
						suma += matriz[f][c];
					}
				}
				if (max == null || suma > max) {
					max = suma;
				}
			}
		}
		return max;
	}

	// Método m3b: Tablero de Buscaminas
	public static int[][] m3b(int tipo) {
		int filas, columnas, totalMinas;
		if (tipo == 1) {
			filas = 8;
			columnas = 8;
			totalMinas = 10;
		} else if (tipo == 2) {
			filas = 16;
			columnas = 16;
			totalMinas = 40;
		} else if (tipo == 3) {
			filas = 16;
			columnas = 30;
			totalMinas = 99;
		} else {
			return null;
		}

		int[][] tablero = new int[filas][columnas];
		Random r = new Random();
		int minasColocadas = 0;

		// 1. Colocar minas aleatoriamente (-1)
		while (minasColocadas < totalMinas) {
			int f = r.nextInt(filas);
			int c = r.nextInt(columnas);
			if (tablero[f][c] != -1) {
				tablero[f][c] = -1;
				minasColocadas++;
			}
		}

		// 2. Rellenar las casillas con el número de minas vecinas
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (tablero[i][j] != -1) {
					int contadorMinas = 0;
					for (int df = -1; df <= 1; df++) {
						for (int dc = -1; dc <= 1; dc++) {
							int ni = i + df;
							int nj = j + dc;
							if (ni >= 0 && ni < filas && nj >= 0 && nj < columnas) {
								if (tablero[ni][nj] == -1) {
									contadorMinas++;
								}
							}
						}
					}
					tablero[i][j] = contadorMinas;
				}
			}
		}
		return tablero;
	}

}