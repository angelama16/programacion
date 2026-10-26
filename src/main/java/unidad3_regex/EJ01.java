package unidad3_regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

import unidad3_regex.EJ01;

public class EJ01 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(EJ01.class.getResourceAsStream("/secuencias.txt")));
		Pattern p = Pattern.compile("ATG(?:[ACGT]{3})+(?:TAA|TAG|TGA)");

//			String linea = in.readLine();
//			while (linea != null) {
//				
//				linea = in.readLine();
//			}

		String linea;
		while ((linea = in.readLine()) != null) {
			System.out.print(linea + ": ");
//				if (p.matcher(linea).matches())
//					System.out.println("ACEPTADA");
//				else
//					System.out.println("RECHAZADA");
			System.out.println(p.matcher(linea).matches() ? "ACEPTADA" : "RECHAZADA");
		}
	}

}
