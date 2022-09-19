
@SuppressWarnings("serial")
public class DepositAmountException extends Exception {
	String message;
	DepositAmountException(){
		message="DepositAmountException Occured";
	}
	
	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Amount is not according to the norm";
	}
}
