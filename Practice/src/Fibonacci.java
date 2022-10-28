
public class Fibonacci {

	public static int fib(int a) {
		if (a == 1 || a == 2)
			return 1;
		else
			return fib(a - 1) + fib(a - 2);
	}

	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			System.out.println(fib(i));
		}
	}

}
