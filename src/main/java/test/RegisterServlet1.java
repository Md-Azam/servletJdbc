package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/reg1")

public class RegisterServlet1 extends GenericServlet {

	@Override
	public void service(ServletRequest req , ServletResponse res) 
	throws ServletException ,IOException{
		Bean ub = new Bean();
		ub.setUname(req.getParameter("uname"));
		ub.setPword(req.getParameter("pword"));
		ub.setFname(req.getParameter("fname"));
		ub.setLname(req.getParameter("lname"));
//		ub.setAddr(req.getParameter("addr"));
//		ub.setMid(req.getParameter("mid"));
		
		ServletContext sct = req.getServletContext();
		sct.setAttribute("bean" ,ub);
		RequestDispatcher rd = req.getRequestDispatcher("reg2.html");
		rd.forward(req, res);	
	}
}
