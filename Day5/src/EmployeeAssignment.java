
public class EmployeeAssignment {
	public static void main(String[] args) {
		Employee[] employees = new Employee[] { 
				new Employee(101, "Sam", "HR", 100), 
				new Employee(102, "Ram", "HR", 200),
				new Employee(305, "Jon", "Marketing", 1000), 
				new Employee(202, "Kim", "RnD", 500),
				new Employee(103, "Dan", "HR", 150) 
		};

		
		System.out.println("Before Sorting");
		Employee.displayAllEmployees(employees);
		
		Employee.sortEmployee(employees);
		System.out.println("After Sorting");
		Employee.displayAllEmployees(employees);
		
		System.out.println("After Searching");
		Employee.searchEmployees(employees, "HR");
		
		// Assignment part 2
		System.out.println("\nCompare 2 Employees");
		Employee emp1 = new Employee(111, "Apoorva", "Finance", 1500);
//		Employee emp2= new Employee(112, "Apoorva", "Finance", 1500);
		Employee emp2= new Employee(111, "Apoorva", "Finance", 1500);
		
		if (emp1.equals(emp2)) {
			System.out.println("Same Employees");
		} else {
			System.out.println("Not Same");
		}
	}
}
