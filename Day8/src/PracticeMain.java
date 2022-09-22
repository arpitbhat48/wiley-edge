import java.util.*;

public class PracticeMain {
	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			Multithreader m1 = new Multithreader(i);

			m1.start();
		}
		
	}

}
