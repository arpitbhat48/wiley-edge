//class Parent {
//    void show()
//    {
//        System.out.println("Parent's show()");
//    }
//}
//  
//
//class Child extends Parent {
//
//
//    void show()
//    {
//        super.show();
//        System.out.println("Child's show()");
//    }
//}
//
//class Simple {
//    public static void main(String[] args)
//    {
//        Parent obj = new Child();
//        obj.show();
//    }
//}

public class Simple implements dog, cat {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		Simple obj = new Simple();
		obj.print();
		obj.show();
	}
}