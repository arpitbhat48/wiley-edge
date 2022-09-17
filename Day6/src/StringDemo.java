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
		return str.substring(0, 5) == str.substring(str.length() - 5, str.length());
	}

	public static boolean checkAnagram(String s1, String s2) {
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return s1.length() == s2.length() && Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		String s = new String("racecar");
		System.out.println("\nPrinting reversed String");
		System.out.println(reversedString(s));

		System.out.println("\nCount character occurances");
		System.out.println(count(s, 'c'));

		System.out.println("\nCompare first and last characters");
		System.out.println(compareExtremes(s));

		System.out.println("\nCheck if anagram");
		System.out.println(checkAnagram("item", "time"));
	}
}
