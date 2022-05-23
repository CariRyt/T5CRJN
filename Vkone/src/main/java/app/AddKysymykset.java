package app;

import java.io.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.Kysymykset;

@WebServlet(
	name = "AddKysymykset",
	urlPatterns = ("/addkysymykset")
)

public class AddKysymykset extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out=response.getWriter();
		out.println("Add kysymykset");
		Kysymykset kysymys=new Kysymykset();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa247");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(kysymys);
		em.getTransaction().commit();
	}

}
