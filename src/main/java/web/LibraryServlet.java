package web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.servlet.annotation.WebServlet;

import minion.Library;

@WebServlet( name="AnnotatedServlet", displayName="Todo Servlet", urlPatterns = {"/*"}, loadOnStartup=1)
public class LibraryServlet extends HttpServlet {
	private Library library = new Library();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) {
		String servletPath = request.getServletPath();
		processRequest(servletPath, response);
	}

	private void processRequest(String servletPath, HttpServletResponse response) {

		try (PrintWriter out = response.getWriter()) {
		    response.setContentType("application/json");       
		    response.setCharacterEncoding("UTF-8");

		    String result = "{\"name\": \"test\"}";

		    out.print(result);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

