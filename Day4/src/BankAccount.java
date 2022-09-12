
public class BankAccount {
	int accountId;
	String accountHolderName;
	double openingBalance, currentBalance;
	public static double totalBalance;

	public BankAccount(int accountId, String accountHolderName, double openingBalance) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.openingBalance = openingBalance;
		this.currentBalance = openingBalance;
		BankAccount.totalBalance += openingBalance;
	}

	public void depositAmount(double amt) {
		currentBalance += amt;
		totalBalance += amt;
		System.out.println(amt + " deposited by " + accountHolderName);
	}

	public void withdrawAmount(double amt) {
		if (currentBalance >= amt) {
			currentBalance -= amt;
			totalBalance -= amt;
			System.out.println(amt + " withdrawn by " + accountHolderName);
		} else {
			System.out.println("Transaction Denied");
		}

	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void displayTotalBalance() {
		System.out.println("Total Balance: " + totalBalance);
	}

	public void displayAccount() {
		System.out.println(accountId + " " + accountHolderName + " " + openingBalance + " " + currentBalance);
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(101, "Arpit", 100);
		b1.depositAmount(100.12);
		b1.withdrawAmount(577);
		BankAccount b2 = new BankAccount(102, "ABC", 1000);
		b2.depositAmount(10);
		b2.withdrawAmount(400);
		b1.displayAccount();
		b2.displayAccount();
		b2.displayTotalBalance();

	}

}
