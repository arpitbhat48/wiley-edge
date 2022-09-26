
public class Stack {
	private char st[];
	private int top;
	private int max;

	Stack(int max) {
		st = new char[max];
		this.max = max;
		top = -1;
	}

	public void push(int x) {
		if (isFull()) {
			System.out.println("OverFlow\nProgram Terminated\n");
			System.exit(1);
		}

		System.out.println("Inserting " + (char)x);
		st[++top] = (char) x;
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("STACK EMPTY");
			System.exit(1);
		}
		System.out.println("Removed " + st[top]);
		return st[top--];
	}

	public Boolean isEmpty() {
		return top == -1;
	}

// Check if the stack is full
	public Boolean isFull() {
		return top == max - 1;
	}
}
