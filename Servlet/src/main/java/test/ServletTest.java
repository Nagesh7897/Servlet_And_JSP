package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTest
 */
@WebServlet("/jump")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletTest() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		out.println("Servlet is up");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String choice=request.getParameter("jump");

		if (choice.equals("Shimla") || choice.equals("shimla"))
		{
		Shimla shimla=new Shimla();
		shimla.shimlaHotel();
		}

		else if(choice.equals("Goa") || choice.equals("goa"))
		{
		Goa goa = new Goa();
		goa.goaHotel();
		}

		else
		{
			System.out.println("No hotel avaiable");
		}
		System.out.println("Please Check on Console");
		
	}

}
