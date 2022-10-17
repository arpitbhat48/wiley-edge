import java.util.ArrayList;
import java.util.List;

public class Parenthesis {
	public static void main(String[] args) {
		String s1 = new String("{");
		System.out.println(checkParenthesis(s1));
		System.out.println(generateParenthesis(4));
	}

	private static List<String> generateParenthesis(int n) {

		ArrayList<String> list = new ArrayList<>();
		list.add("{}");
		String s = new String();
		int k = 1;
		boolean flag = false;
		for (int i = 1; i < k; i++) {
			System.out.println(list);
			k = 3 * k - 1;
			s = list.remove(0);
			list.add(s + "{}");
			list.add("{}" + s);
			list.add("{" + s + "}");

		}

		return list;

	}

	private static boolean checkParenthesis(String s1) {
		// TODO Auto-generated method stub
		char op = '{', cl = '}';
		char[] ch = s1.toCharArray();
		Stack stack = new Stack(ch.length);

//		if (s1.length() < 2)
//			return false;

		for (char c : ch) {
			if (c == op) {
				stack.push(c);
			} else if (c == cl) {
				if (!stack.isEmpty())
					stack.pop();
				else
					return false;
			}

		}
		return stack.isEmpty();
	}
}
