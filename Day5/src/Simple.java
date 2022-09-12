
public class Simple {
	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance(10);
		Singleton s2 = Singleton.getInstance(20);

		s1.singletonPrint();
		s2.singletonPrint();

		Lazy l1 = Lazy.getInstance(5);
		Lazy l2 = Lazy.getInstance(8);
		l1.singletonPrint();
		l2.singletonPrint();
	}
}

class Singleton {

	private static Singleton obj;
	int a;

	private Singleton(int a) {
		this.a = a;
	}

	public static Singleton getInstance(int a) {
		if (obj == null)
			obj = new Singleton(a);
		return obj;
	}

	public void singletonPrint() {
		System.out.println(a);
	}
}

class Lazy {
	private static Lazy obj;
	int n;

	private Lazy(int n) {
		this.n = n;
	}

	public static Lazy getInstance(int n) {
		if (obj == null) {
			synchronized (Lazy.class) {
				if (obj == null) {
					obj = new Lazy(n);// instance will be created at request time
				}
			}
		}
		return obj;
	}

	public void singletonPrint() {
		System.out.println(n);
	}
}
