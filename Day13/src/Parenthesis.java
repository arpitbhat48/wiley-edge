
public class Parenthesis {
	public static void main(String[] args) {
		String s1 = new String("{");
		System.out.println(checkParenthesis(s1));
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
