package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/reg2")
public class RegisterServlet2 extends GenericServlet{

	@Override
	public void service(ServletRequest req , ServletResponse res)
			throws ServletException,IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		ServletContext sct = req.getServletContext();
		Bean ub  = (Bean)sct.getAttribute("bean");
		ub.setAddr(req.getParameter("addr"));
		ub.setMid(req.getParameter("mid"));
		ub.setPhone(Long.parseLong(req.getParameter("phone")));
		 int k = new Registerdao().register(ub);
		 if(k>0) {
			 pw.println("User Registered successfully");
			 RequestDispatcher rd = req.getRequestDispatcher("login.html");
			 
			 rd.include(req, res);
		 }
		
	}
}
