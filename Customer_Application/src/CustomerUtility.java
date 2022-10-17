import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

class CustomerUtility implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		return c2.getTotalBill() > (int) c1.getTotalBill() ? 1 : -1;
	}

	public static ArrayList<Customer> displayAll(ArrayList<Customer> customers) {
		for (Customer c : customers)
			c.display();
		return customers;
	}

	public static void printConditionally(ArrayList<Customer> customers, Condition condition) {
		for (Customer customer : customers) {
			if (condition.test(customer))
				customer.display();
		}
	}

	public static void filterAreaCode(ArrayList<Customer> customers, String code) {
		printConditionally(customers, new Condition() {
			public boolean test(Customer c) {
				return c.getCustomerAreaCode().equals(code);
			}
		});

	}

	public static void serializeList(ArrayList<Customer> customers) {
		try {
			FileOutputStream fos = new FileOutputStream("CustomerData.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(customers);
			oos.close();
			fos.close();
			System.out.println("Customers serialized");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<Customer> deserializeList(String fileName) {
		ArrayList<Customer> customers = null;
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			customers = (ArrayList<Customer>) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Successfully DeSerialized");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return customers;
	}

	public static void displayHashMap(HashMap<String, ArrayList<Customer>> customers) {
		customers.entrySet()
				.forEach(entry -> System.out.println("Area Code: " + entry.getKey() + " " + entry.getValue()));
	}

	public static void getHashMap(ArrayList<Customer> customers) {
		HashMap<String, ArrayList<Customer>> areaMap = new HashMap<>();
		
		for (Customer c : customers) {
//			areaMap.putIfAbsent(c.getCustomerAreaCode(), new ArrayList<Customer>{c});
			areaMap.computeIfAbsent(c.getCustomerAreaCode(), k -> new ArrayList<>()).add(c);
		}
//		return areaMap;
		displayHashMap(areaMap);
	}
}
