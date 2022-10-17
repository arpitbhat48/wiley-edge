import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  s = sc.nextLine();
		
		
		combination(s,"");
		

	}
	
	public static void combination(String s, String res) {
		if(s.length() == 0) {
			System.out.println(res);
			return;
		}
		char c;
		String r;
		for(int i=0; i<s.length(); i++) {
			c = s.charAt(i);
			r = s.substring(0,i) + s.substring(i+1);
			combination(r,res+c);
		}
	}

}
