package rest;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Path("/questions")
public class EditQuestions extends HttpServlet {
	
	@Context
	HttpServletRequest request;
	
	@Context
	HttpServletResponse response;
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("electionmachine");
	

}
