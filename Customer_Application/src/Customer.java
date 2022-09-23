import java.io.Serializable;


@SuppressWarnings("serial")
public class Customer implements Serializable {
	
	private int customerId, numberOfUnitsConsumed;
	private double totalBill;
	private String customerName, customerAreaCode;

	public Customer(int customerId, String name, String customerAreaCode, int numberOfUnitsConsumed) {
		this.customerAreaCode = customerAreaCode;
		this.customerId = customerId;
		this.customerName = name;
		this.numberOfUnitsConsumed = numberOfUnitsConsumed;
		setTotalBill(numberOfUnitsConsumed);
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(int units) {
		if (units > 150) {
			this.totalBill += ((units - 150) * 1) + (50 * 0.75) + (100 * 0.5);
		} else if (units > 100) {
			this.totalBill = ((units - 100) * 0.75) + (100 * 0.5);
		} else {
			this.totalBill = units * 0.5;
		}
	}

	public void setNumberOfUnitsConsumed(int numberOfUnitsConsumed) throws InvalidUnitConsumedException {
		if (numberOfUnitsConsumed <= 0)
			throw new InvalidUnitConsumedException();
		this.numberOfUnitsConsumed = numberOfUnitsConsumed;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerAreaCode() {
		return customerAreaCode;
	}

	public int getNumberOfUnitsConsumed() {
		return numberOfUnitsConsumed;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String toString() {
		return this.customerId + " " + this.customerName + " " + this.customerAreaCode + " "
				+ this.numberOfUnitsConsumed + " " + this.totalBill;
	}

	public void display() {
		System.out.println("ID: " + getCustomerId());
		System.out.println("Name: " + getCustomerName());
		System.out.println("Area Code: " + getCustomerAreaCode());
		System.out.println("Units Consumed: " + getNumberOfUnitsConsumed());
		System.out.println("Total bill " + getTotalBill() + "\n");
	}

}
