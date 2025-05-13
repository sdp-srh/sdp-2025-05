package basic;


public class LoopBreakExample {
	public static void main(String[] args) {
		for (int i=0; i<=10;i++) {
			System.out.println(i);
			if (i==2) {
				break;
			}
		}
		System.out.println("That's it");
	}
}
