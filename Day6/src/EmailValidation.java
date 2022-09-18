import java.util.regex.*;

public class EmailValidation {
	String email;

	public EmailValidation(String email) {
		this.email = email;
		validate();
	}

	public void validate() {
		System.out.println(Pattern.matches("[a-zA-Z]\\w+@{1}[a-zA-Z]\\w+.com", this.email));
	}


}
