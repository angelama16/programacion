package unidad3_strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.File;
import java.io.IOException;

public class EJ07 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File(args[0]));
		Pattern p = Pattern.compile("\"(https?.*?)\"");
		String url;
		while ((url = in.findWithinHorizon(p, 0)) != null)
			System.out.println(url);
	}

}
