
public class BankAccount {
	int accountId;
	String accountHolderName;
	double interestRate;

	AccountType type_savings = AccountType.SAVINGS;
	AccountType type_current = AccountType.CURRENT;

	public BankAccount(int accountId, String accountHolderName, String accountType) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		identifyAccountType(accountType);

	}

	private void identifyAccountType(String accountType) {
		// TODO Auto-generated method stub
		switch (accountType) {
		case "SAVINGS":
			this.interestRate = type_savings.getInterestRate();
			break;
		case "CURRENT":
			this.interestRate = type_current.getInterestRate();
			break;
		}
	}

	public double calculateTotalInterest(double amount, int years) throws DepositAmountException {
		if (amount <= 0)
			throw new DepositAmountException();
		return amount * years * interestRate;
	}

	public static void main(String[] args) throws DepositAmountException {
		BankAccount b1 = new BankAccount(101, "Arpit", "SAVINGS");
		BankAccount b2 = new BankAccount(102, "Apoorva", "CURRENT");
		BankAccount b3 = new BankAccount(103, "John Doe", "CURRENT");

		System.out.println(b1.calculateTotalInterest(5000, 5));
		System.out.println(b2.calculateTotalInterest(5000, 5));
		System.out.println(b3.calculateTotalInterest(0, 15));
	}

}
