public enum AccountType {
	SAVINGS(0.05), CURRENT(0.08);
	private double interestRate;

	AccountType(double interestRate) {
		this.interestRate = interestRate;
	}

	double getInterestRate() {
		return this.interestRate;
	}

}