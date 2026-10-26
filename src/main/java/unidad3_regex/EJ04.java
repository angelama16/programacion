package unidad3_regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EJ04 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		String html = in.readAllAsString();
//		Pattern p = Pattern.compile("\"(https?.*)\"");
//		Matcher m = p.matcher(html);
		Matcher m = Pattern.compile("\"(https?.*?)\"").matcher(html);
		while (m.find())
			System.out.println(m.group(1));
	}

}
