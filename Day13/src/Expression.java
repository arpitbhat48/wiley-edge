
public class Expression {

	public static void main(String[] args) {

		Stack s1 = new Stack(10);
		Stack s2 = new Stack(10);

		String s = "2*3+5";
		char[] exp = s.toCharArray();
		for (int i = 0; i < exp.length; i++) {
			if (exp[i] >= '0' && exp[i] <= '9') {
				s1.push(exp[i]);
			} else {
				s2.push(exp[i]);
			}
		}

		int res = Character.getNumericValue(s1.pop());
		while (!s1.isEmpty()) {
			int a = Character.getNumericValue(s1.pop());
//			int b = Character.getNumericValue(s1.pop());
			char c = s2.pop();
			switch (c) {
			case '+':
				res += a;
				break;
			case '-':
				res -= a;
				break;
			case '*':
				res *= a;
				break;
			case '/':
				res /= a;
				break;
			}
		}
		System.out.println(res);
	}

}
