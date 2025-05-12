package test;

public class HelloWorld {

	public static void main(String[] args) {
		
		int abs = 0;
		int x = -10;
		if (x < 0) {
			System.out.println(" X is negative");
			abs = x * -1;
		}
		else {
			abs = x;
		}
		System.out.println(abs);

		// System.out.println("Welcome to SDP!");
	}

}
