package rest;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import data.Kysymykset;

@Path("/questions")
public class EditQuestions extends HttpServlet {
	
	@Context
	HttpServletRequest request;
	
	@Context
	HttpServletResponse response;
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("electionmachine");
	
	@GET
	@Path("/allquestions")
	public void readAllQuestions() {
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
	    List<Kysymykset> list = em.createQuery("select k from Kysymykset k").getResultList();
		em.getTransaction().commit();
		request.setAttribute("kysymyslista", list);
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/showallquestions.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	@DELETE
	@Path("/deletequestions/{kysymys_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteQuestions(@PathParam("kysymys_id") int kysymys_id) {
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Kysymykset k=em.find(Kysymykset.class, kysymys_id);
		
		if (k!=null) {
			em.remove(k);
		}
		em.getTransaction().commit();
				
		
		
	}
}
