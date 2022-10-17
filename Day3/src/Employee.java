// employee class (id, firstname) 
// 3 objects of emp and add in hashset
// print all

public class Employee {
	private int empID;
	private String empFirstName;
	Employee(int id, String name) {
		this.empID = id;
		this.empFirstName = name;
	}
	
	@Override
	public String toString() {
		return this.empID + " " + this.empFirstName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empFirstName == null) ? 0 : empFirstName.hashCode());
		result = prime * result + empID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empFirstName == null) {
			if (other.empFirstName != null)
				return false;
		} else if (!empFirstName.equals(other.empFirstName))
			return false;
		if (empID != other.empID)
			return false;
		return true;
	}
}
