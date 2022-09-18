public class SalaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		calculateGrossSalary(5000);
		}
		catch(SalaryException se) {
			System.out.println(se.getMessage());
			System.out.println(se);
		}
		
		

	}

	private static void calculateGrossSalary(int basicSalary) throws SalaryException  {
		// TODO Auto-generated method stub
		if(basicSalary<8000)
			throw new SalaryException();
	}

}