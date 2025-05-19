package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import db.DBHandler;
import db.Person;

/**
 * Servlet implementation class ShowPersonsServlet
 */
public class ShowPersonsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowPersonsServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DBHandler dbh = new DBHandler();
		ArrayList<Person> persons = dbh.readPersons();
		String html = "<html><body><h1>Persons</h1>";
		for (Person p : persons) {
			//System.out.println(p.getFirstName()+ "  "+ p.getLastName());
			html += "<p>"+p.getFirstName()+ "  "+ p.getLastName()+"</p>";
		}
		html += "</body></html>";
		response.getWriter().append(html);
	}



}
