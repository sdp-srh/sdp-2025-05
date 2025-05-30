package db;

/**
 * contains data for a person
 * @author srh
 *
 */
public class Person {
	private String firstName;
	private String lastName;
	
	public Person() {
		this.firstName = "";
		this.lastName = "";
	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
