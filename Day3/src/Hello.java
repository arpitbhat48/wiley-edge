
public class Hello {

	public static void main(String[] args) {

		System.out.println("Hello");
		int n1 = 4;
		
		System.out.println(isEven(n1));
		System.out.println();
		
		forLoop(5);
		System.out.println();
		
		whileLoop(4);
		System.out.println();
		
		doWhileLoop(4);
		System.out.println();
		
		breakContinue();
		System.out.println();
		
		switchCase('b');
		System.out.println();
	}

	public static void switchCase(char c) {
		System.out.println("Switch case");
		switch (c) {
			case 'a':
				System.out.println(1);
			case 'b':
				System.out.println(2);
			case 'c':
				System.out.println(3);
			case 'd':
				System.out.println(4);
			case 'e':
				System.out.println(5);
		}
	}
	
	public static boolean isEven(int n) {
		System.out.println("If else");
		return (n % 2 == 0);
	}

	public static void forLoop(int n) {
		System.out.println("For");
		for (int i = 0; i < n; i++) {
			System.out.println("Loop: " + i);
		}
	}

	public static void whileLoop(int n) {
		System.out.println("While");
		while (n > 0) {
			System.out.println(n);
			n--;
		}
	}

	public static void doWhileLoop(int n) {
		System.out.println("Do While");
		do {
			System.out.println(n);
			n--;
		} while (n > 0);
	}

	public static void breakContinue() {
		System.out.println("Break and Continue");
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0)
				continue;
			if (i == 8)
				break;
			System.out.print(i + " ");
		}
	}

}
