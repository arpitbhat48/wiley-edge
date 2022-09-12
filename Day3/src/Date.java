
public class Date {
	int dd, mm, yyyy;
	
	public Date(int dd, int mm, int yyyy) {
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public void displayDate() {
		if (checkDate())
			System.out.println(dd + " " + mm + " " + yyyy);
		else
			System.out.println("Invalid Date");
	}
	private boolean checkDate() {
		if (dd>31 || dd<1) {
			return false;
		} else if (mm>12 || mm<1) {
			return false;
		} else if (yyyy>9999 || yyyy<1000) {
			return false;
		}
		return true;
	}
	
}
