package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends GenericServlet {

	
	@Override
	public void service(ServletRequest req ,ServletResponse res)
throws ServletException ,IOException {
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	String Fname = new Logindao().login(req);
	
	if(Fname == null) {
		pw.println("invalid login details ..<br>");
		RequestDispatcher rd = req.getRequestDispatcher("login.html");
		rd.include(req, res);	
	}else {
		pw.println("Welcome user " + Fname + "<br>");
		
		pw.println("login successfull");
	}
}
}
