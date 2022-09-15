import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/*
 * 
Create Employee class with following details: 
Attributes: 
empId, empName, empDept, empBasicSalary, empGrossSalary 
Behavior
oParameterized constructor for empId,empName, empDept and 
empBasicSalary
ocalculateGrossSalary to calculate grossSalary with following formula
grossSalary=basicSalary+HRA+DA
HRA=12% of basicSalary
DA=8%of basicSalary

Problem 1: 
Create 5 employee objects and store it in the array. 
Display the Employees in the ascending order of their salary. 
(create the function sortEmployees)
Display all the employees in the specific department in the given array. 
(Create the function searchEmployees)

Problem 2:
Create 2 objects of Employee and check their equality by overriding equals 
method. 
(check the equality for empId and empName)
 * 
 */

public class Employee {
	int empId, empBasicSalary;
	double empGrossSalary;
	String empName, empDept;
	ArrayList<Employee> employees = new ArrayList<Employee>();

	public Employee(int empId, String empName, String empDept, int empBasicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empBasicSalary = empBasicSalary;
		this.empDept = empDept;
		this.empGrossSalary = calculateGrossSalary();
	}

	public static void sortEmployee(Employee employees[]) {
		Arrays.sort(employees, new Comparator<Employee>() {
			public int compare(Employee emp1, Employee emp2) {
				if (emp1.getEmpGrossSalary() > emp2.getEmpGrossSalary())
					return 1;
				return -1;
			}
		});
	}

	public void displayEmployee() {
		System.out.println(empId + " " + empName + " " + empDept + " " + empBasicSalary);
	}

	public static void displayAllEmployees(Employee[] employees) {
		for (Employee emp : employees) {
			emp.displayEmployee();
		}
		System.out.println();
	}

	@Override
	public boolean equals(Object obj1) {
		if (this == obj1) {
			return true;
		}
		if (obj1 == null) {
			return false;
		}
		if (getClass() != obj1.getClass()) {
			return false;
		}
		Employee obj2 = (Employee) obj1;
		return empId == obj2.empId && Objects.equals(empName, obj2.empName);
	}

	// Search based on dept
	public static void searchEmployees(Employee employees[], String dept) {
		for (Employee emp : employees) {
			if (emp.getEmpDept().equals(dept)) {
				System.out.println(emp.getEmpId() + " " + emp.getEmpName());
			}
		}
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpGrossSalary() {
		return empGrossSalary;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public double calculateGrossSalary() {
		return 1.2 * empBasicSalary;
	}

}
