package app;

import java.io.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/secretservlet"})
public class SecretServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
    response.setContentType("text/plain;utf-8");
    PrintWriter out=response.getWriter();
    out.print("You're not supposed to see this! .. or are you? >:)");
  }
}