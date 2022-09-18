
public class Assignment6 {

	public static void main(String[] args) throws DepositAmountException {
		// TODO Auto-generated method stub
		
		String s = new String("racecar");
		System.out.println("\nPrinting reversed String");
		System.out.println(StringDemo.reversedString(s));

		System.out.println("\nCount character occurances");
		System.out.println(StringDemo.count(s, 'c'));

		System.out.println("\nCompare first and last characters");
		System.out.println(StringDemo.compareExtremes(s));

		System.out.println("\nCheck if anagram");
		System.out.println(StringDemo.checkAnagram("item", "time"));
		
		System.out.println("\nValidate Email");
		EmailValidation email1 = new EmailValidation("wi@.gmail@1234");
		EmailValidation email2 = new EmailValidation("wi@gmail.com");
		
		System.out.println("\nCalculate Interest");
		BankAccount b1 = new BankAccount(101, "Arpit", "SAVINGS");
		BankAccount b2 = new BankAccount(102, "Apoorva", "CURRENT");
		BankAccount b3 = new BankAccount(103, "John Doe", "CURRENT");

		System.out.println(b1.calculateTotalInterest(5000, 5));
		System.out.println(b2.calculateTotalInterest(5000, 5));
		System.out.println(b3.calculateTotalInterest(20000, 15));
	}

}
