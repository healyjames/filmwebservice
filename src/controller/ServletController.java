package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.Film;
import model.FilmDAO;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		FilmDAO dao = new FilmDAO();
		ArrayList<Film> films = dao.getAllFilms();
		String outputPage;
		
		request.setAttribute("films", films);
	    String format = request.getParameter("format");
	    
	    
	    if ("xml".equals(format)) {
	    	
	      response.setContentType("text/xml");
	      outputPage = "/WEB-INF/results/films-xml.jsp";
	      
	    } else if ("json".equals(format)) {
	    	
	      response.setContentType("application/json");
	      outputPage = "/WEB-INF/results/films-json.jsp";
	      
	    } else {
	    	
	      response.setContentType("text/plain");
	      outputPage = "/WEB-INF/results/films-string.jsp";
	      
	    }
	    
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher(outputPage);
	    dispatcher.include(request, response);
	    
	    
	  }
	
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}

}
