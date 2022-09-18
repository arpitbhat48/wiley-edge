import java.util.Arrays;

public class StringDemo {
	public static String reversedString(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		return sb.reverse().toString();

	}

	public static int count(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				count++;
		}
		return count;
	}

	public static boolean compareExtremes(String str) {
//		System.out.println(str.substring(0, 5));
//		System.out.println(str.substring(str.length() - 5, str.length()));
		return str.charAt(0) == str.charAt(str.length() - 1);
	}

	public static boolean checkAnagram(String s1, String s2) {
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return s1.length() == s2.length() && Arrays.equals(charArray1, charArray2);
	}
}
