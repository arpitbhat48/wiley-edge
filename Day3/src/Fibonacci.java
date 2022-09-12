
public class Fibonacci {
	int n;
	int x,y;
	
	public Fibonacci(int n) {
		this.n = n;
		this.x = 1;
		this.y = 1;
	}
	public int fib(int num) {
		if (num<=2) 
			return 1;
		return fib(num-1)+fib(num-2);
	}
	public void printFib() {
		for (int i=1; i<=n; i++) {
			System.out.print(fib(i) + " ");
		}
	}
	public static void main(String[] args) {
		Fibonacci f1 = new Fibonacci(10);
		f1.printFib();

	}

}
