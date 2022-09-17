
public class BankAccount {
	int accountId;
	String accountHolderName;
	double openingBalance, currentBalance;
	static double totalBalance;
	boolean valid;

	AccountType type_savings = AccountType.SAVINGS;
	AccountType type_current = AccountType.CURRENT;

	static {
		totalBalance = 0;
	}

	public BankAccount(int accountId, String accountHolderName, double openingBalance, String accountType) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;

		if ((accountType.equals("SAVINGS") && openingBalance >= type_savings.minimumBalance())
				|| (accountType.equals("CURRENT") && openingBalance >= type_current.minimumBalance())) {
			this.openingBalance = openingBalance;
			this.currentBalance = openingBalance;
			BankAccount.totalBalance += openingBalance;
			valid = true;
			System.out.println("Account created successfully");
		} else {
			System.err.println("Invalid registration");
		}
		System.out.println();

	}

	public void depositAmount(double amt) {
		if (valid) {
			currentBalance += amt;
			totalBalance += amt;
			System.out.println(amt + " deposited by " + accountHolderName);
		} else {
			System.err.println("Invalid Account");
		}
		System.out.println();

	}

	public void withdrawAmount(double amt) {
		if (valid) {
			if (currentBalance >= amt) {
				currentBalance -= amt;
				totalBalance -= amt;
				System.out.println(amt + " withdrawn by " + accountHolderName);
				System.out.println("Remaining Balance: " + getCurrentBalance());
			} else {
				System.err.println("Transaction Denied");
			}
		} else {
			System.err.println("Invalid Account");
		}
		System.out.println();

	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void displayTotalBalance() {
		System.out.println("Total Balance: " + totalBalance);
	}

	public void displayAccount() {
		System.out.println("Account Details: " + accountId + " " + accountHolderName + " " + openingBalance + " "
				+ currentBalance);
		System.out.println();
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(101, "Arpit", 2000, "CURRENT");
		b1.depositAmount(100);
		b1.withdrawAmount(600);

		BankAccount b2 = new BankAccount(102, "ABC", 1000, "SAVINGS");
		b2.depositAmount(10);
		b2.withdrawAmount(400);

		b1.displayAccount();
		b2.displayAccount();
		b2.displayTotalBalance();

		BankAccount b3 = new BankAccount(102, "PQR", 600, "SAVINGS");
		b3.depositAmount(50);
		b3.withdrawAmount(750);
		b3.displayAccount();

	}

}
