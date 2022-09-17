
@SuppressWarnings("serial")
public class DepositAmountException extends Exception {
	String message;
	DepositAmountException(){
		message="DepositAmountException Occured";
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Amount is not according to the norm";
	}
}
