public enum AccountType {
	SAVINGS(500), CURRENT(1000);
	private int minimumBalance;

	AccountType(int min) {
		this.minimumBalance = min;
	}

	int minimumBalance() {
		return this.minimumBalance;
	}

}