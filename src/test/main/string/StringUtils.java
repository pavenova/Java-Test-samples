package test.main.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

	public static String composeSQLQuery(String columns, String tableName, String restrictions) {
		StringBuilder sb = new StringBuilder("Select");
		sb.append(" ");
		sb.append(columns);
		sb.append(" ");
		sb.append("from");
		sb.append(" ");
		sb.append(tableName);
		sb.append(" ");
		sb.append("where");
		sb.append(" ");
		sb.append(restrictions);
		return sb.toString();
	}

	public static boolean isValidEmail(String mail) {
		final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(mail);
		return matcher.find();
	}

	public static ArrayList<String> getUserListFromfilePath(String filePath) {
		ArrayList<String> ret = new ArrayList<>();
		try {
			File data = new File(filePath);
			BufferedReader b = new BufferedReader(new FileReader(data));

			String readLine = "";

			System.out.println("Reading file using Buffered Reader");

			while ((readLine = b.readLine()) != null) {
				// System.out.println(readLine);
				if (isValidEmail(readLine) && !ret.contains(readLine)) {
					ret.add(readLine);
				}

			}

		} catch (Exception e) {
			System.out.println("not working");
			e.printStackTrace();
		}

		System.out.println("found mails: " + ret.size());

		for (String mail : ret) {
			System.out.print(mail);
			System.out.print(";");
			// System.out.println();
		}

		return ret;
	}

	public static void strReplace() {
		String str = "hello \"there";
		System.out.println(str);
		String str1 = str.replaceAll("\"", "^");
		System.out.println(str1);
		// because regex!!!
		String str2 = str1.replaceAll("\\^", "\"");
		System.out.println(str2);
		System.out.println(str1.replaceAll("^", "\""));
	}

	// get number of deletions / edits - inc 1 per each
	public static void editDistance() {
		String s1 = "casa";
		String s2 = "cara";

		String longer;
		String shorter;
		if (s1.length() > s2.length()) {
			longer = s1;
			shorter = s2;
		} else {
			shorter = s1;
			longer = s2;
		}

		int edits = 0;
		for (int i = 0; i < shorter.length(); i++) {
			if (shorter.charAt(i) != longer.charAt(i)) {
				edits++;
			}
		}

		edits = edits * 2; // one delete, one insert you told
		edits = edits + Math.abs(s1.length() - s2.length()); // if different length then add counts of added/removed
																// chars

		System.out.println("edit count: " + edits);

	}

}
