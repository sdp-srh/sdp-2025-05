package test;

public class KeywordExample {
	
	private String name;
	
	public KeywordExample() {
		name = "Paul";
	}
	
	public void setName(String name) {
		// 
		this.name = name;
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		KeywordExample kwe = new KeywordExample();
		kwe.setName("Test");
	}

}
