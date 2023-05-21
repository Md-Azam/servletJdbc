package test;
import java.sql.*;
import javax.servlet.*;
public class Logindao {
public String Fname = null;
public String login(ServletRequest req) {
	{
		try {
		Connection con =DBconnection.getCon();
		PreparedStatement pst = con.prepareStatement
				("Select * from UserReg38 where Uname= ? and Pword=?");
		
		pst.setString(1, req.getParameter("uname"));
		pst.setString(2,req.getParameter("pword"));
		
		ResultSet rs= pst.executeQuery();
		if(rs.next()) {
			Fname = rs.getString(3);
			
		}
		
		
		}catch(Exception e) { e.printStackTrace();}
	}
	return Fname;
}
}
