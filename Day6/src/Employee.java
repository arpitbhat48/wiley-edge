// 9. Create the Employee class, which should contain the attributes empId, 
// empName. Along with that, it should also contain empAddresses, which is 
// array of address. This should consist of temporary address and permanent address. 
// Write a program to instantiate the employee object and display all the 
// attributes of the same.
// Attributes of address class: flatNumber, flatName, roadName, cityName.

public class Employee {
	int empId;
	String empName;
	Address[] empAddress;

	public Employee(int empId, String empName, Address[] empAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	
	public void displayAddress(Address[] empAddress) {
		for(int i=0;i<empAddress.length;i++) {
			if(i==0) {
				System.out.println("Temporary Address: "+empAddress[i]);
			}else {
				System.out.println("Permanent Address: "+empAddress[i]);
			}
		}
	}
	
	public void display() {
		System.out.println("Employee id: "+this.empId);
		System.out.println("Employee Name: "+this.empName+"\n"+"Address");
		displayAddress(this.empAddress);
	}
}
