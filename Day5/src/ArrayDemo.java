public class ArrayDemo {
	public ArrayDemo(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// datatype[] arrayname=new datatype[sizeofarray]

		int[] data = new int[] { 10, 54, 23, 54, 12 };
		data[0] = 12;

		// never print array directly with name. it gives you the hash value for array.

		for (int i = 0; i < data.length; i++)
			System.out.println(data[i]);

		for (int value : data) {
			System.out.println(value);

		}

		// array creation of objects
		ArrayDemo[] empArray = new ArrayDemo[] { new ArrayDemo(101, "John Doe"), new ArrayDemo(102, "John Doe"),
				new ArrayDemo(103, "John Doe") };
//		empArray[0]=new Employee(101,"John Doe");
//		empArray[1]=new Employee(102,"John Doe");
//		empArray[2]=new Employee(103,"John Doe");

		for (ArrayDemo employee : empArray)
			System.out.println(employee);
	}
}
