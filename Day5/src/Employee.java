
public class Employee {
	int empId, empBasicSalary;
	double empGrossSalary;
	String empName, empDept;
	
	public Employee (int empId, String empName, String empDept, int empBasicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empBasicSalary = empBasicSalary;
		this.empDept = empDept;
		calculateGrossSalary();
	}
	
	public void calculateGrossSalary() {
		this.empGrossSalary = empBasicSalary + (0.2*empBasicSalary);
	}
	
	public void displayEmployee() {
		System.out.println(empId + " " + empName + " " + empDept + " " + empBasicSalary);
	}
	
	public static void sortEmployee() {
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Sam", "HR", 100);
		Employee emp2 = new Employee(102, "Ram", "HR", 200);
		Employee emp3 = new Employee(305, "Jon", "CEO", 1000);
		Employee emp4 = new Employee(202, "Kim", "RnD", 500);
		Employee emp5 = new Employee(103, "Dan", "HR", 150);
		
		emp1.displayEmployee();
		emp2.displayEmployee();
		emp3.displayEmployee();
		emp4.displayEmployee();
		emp5.displayEmployee();
		
		Employee.sortEmployee();
	}

}
