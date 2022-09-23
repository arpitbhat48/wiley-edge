import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CustomerApp {
	public static void displayOptions() {
		System.out.println("1. Add new Customer ");
		System.out.println("2. Display All Customers ");
		System.out.println("3. Sort Customers ");
		System.out.println("4. Filter using Area Code ");
		System.out.println("5. Serialize");
		System.out.println("6. Deserialize");
		System.out.println("7. Build Hash Map");
		System.out.println("8. Exit");
	}

	public static void main(String[] args) throws InvalidUnitConsumedException {
		Scanner sc = new Scanner(System.in);
		int option;
		boolean loop = true;
		ArrayList<Customer> customers = new ArrayList<Customer>();

		customers.add(new Customer(1, "arpit", "401", 200));
		customers.add(new Customer(2, "parth", "404", 300));
		customers.add(new Customer(3, "pravendra", "404", 100));
		customers.add(new Customer(4, "nikita", "402", 150));
		customers.add(new Customer(5, "abhay", "401", 70));
		customers.add(new Customer(6, "koena", "404", 120));

		do {
			displayOptions();
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter Details as ID, Name, AreaCode, Unit Consumed:");
				customers.add(new Customer(sc.nextInt(), sc.next(), sc.next(), sc.nextInt()));
				break;
			case 2:
				CustomerUtility.displayAll(customers);
				break;
			case 3:
				Collections.sort(customers, new CustomerUtility());
				System.out.println("Sorted");
				break;
			case 4:
				System.out.println("Input Area Code: ");
				CustomerUtility.filterAreaCode(customers, sc.next());

				break;
			case 5:
				CustomerUtility.serializeList(customers);
				break;
			case 6:
				System.out.println(CustomerUtility.deserializeList("CustomerData.txt"));
				break;
			case 7:
				CustomerUtility.getHashMap(customers);
				break;
			default:
				System.out.println("Bye");
				loop = false;
				break;
			}
			System.out.println();
		} while (loop);
		sc.close();
	}
}
