package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegDAO;
import vo.RegVO;

/**
 * Servlet implementation class RegController
 */
@WebServlet("/RegController")
public class RegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String s1=request.getParameter("fn");
		String s=request.getParameter("ln");
		String s2=request.getParameter("un");
		String s3=request.getParameter("pw");
		
		RegVO a = new RegVO();
		a.setFn(s1);
		a.setLn(s);
		a.setUn(s2);
		a.setPw(s3);
		
		RegDAO b = new RegDAO();
		b.insert(a);
		response.sendRedirect("data.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
