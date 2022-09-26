import java.util.ArrayList;
import java.util.List;

public class StringMatcher {

	public static int solve(int n, int k) {
		return n == 1 ? 1 : (solve(n - 1, k) + k - 1) % n + 1;
	}

	public static boolean match(String s1, String s2) {
//		int m = s1.length(), n = s2.length();
		if (s1.equals(s2))
			return true;
		if (s1.length() != s2.length())
			return false;
		List<Character> l1 = new ArrayList<Character>();
		List<Character> l2 = new ArrayList<Character>();
//        char[] l1 = new char[3];
//        char[] l2 = new char[3];

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				l1.add(s1.charAt(i));
				l2.add(s2.charAt(i));
			}
			if (l1.size() > 2)
				return false;
		}

		return (l1.size() == 2) && (l1.get(0) == l2.get(1) && l2.get(0) == l1.get(1));
	}

	public static void main(String[] args) {
		String s1 = new String("tpnk");
		String s2 = new String("tank");
		System.out.println(match(s1, s2));

		int k = 2;
		int[] arr1 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
		int n1 = arr1.length;
		System.out.println(solve(n1, k));

		int[] arr2 = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,3, 15, 16, 17 };
		int n2 = arr2.length;

		System.out.println(magicSearch(arr2, 0, n2));
	}

	private static int magicSearch(int[] arr, int lo, int hi) {
		int mid = (int) (lo + hi) / 2;
		int k= mid;
		if (arr[mid] == k) {
			return mid;
		} else if (lo != hi) {
			if (arr[mid] > k)
				return magicSearch(arr, lo, mid - 1);
			else if (arr[mid] < k) {
				return magicSearch(arr, mid + 1, hi);
			}
		} else {
			return -1;
		}
		return -1;

	}

}
