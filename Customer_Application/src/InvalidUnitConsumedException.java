
@SuppressWarnings("serial")
public class InvalidUnitConsumedException extends Exception {
	String message;

	InvalidUnitConsumedException() {
		message = "InvalidUnitConsumedException Occured";
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Units cannot be zero or negetive";
	}
}
