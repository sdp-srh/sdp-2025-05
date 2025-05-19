package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import db.DBHandler;
import db.Person;

/**
 * Servlet implementation class CreateNewPersonServlet
 */
public class CreateNewPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateNewPersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servlet create Person was called");
		System.out.println(request.getParameter("fname"));
		DBHandler dbh = new DBHandler();
		Person newPerson = new Person();
		newPerson.setFirstName(request.getParameter("fname"));
		newPerson.setLastName(request.getParameter("lname"));
		dbh.insertPerson(newPerson);
		response.getWriter().append("New Person created: "+newPerson.getLastName()+", "+newPerson.getFirstName());	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
