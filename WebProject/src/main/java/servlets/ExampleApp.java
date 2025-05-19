package servlets;

import java.util.ArrayList;

import db.DBHandler;
import db.Person;

public class ExampleApp {

	public static void main(String[] args) {
		DBHandler dbh = new DBHandler();
		ArrayList<Person> persons = dbh.readPersons();
		for (Person p : persons) {
			System.out.println(p.getFirstName()+ "  "+ p.getLastName());
		}
	}

}
