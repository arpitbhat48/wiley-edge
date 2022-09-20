
public class AreaOfCircle {
	int radius;
	double area;

	public AreaOfCircle(int radius) {
		this.radius = radius;
	}

	public double calcArea() {
		return radius * 3.14;
	}

	public static void main(String[] args) {
		AreaOfCircle a1 = new AreaOfCircle(10);
		System.out.println(a1.calcArea());
	}
}
