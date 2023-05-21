package test;
import java.sql.*;
public class Registerdao {

	public int k=0;
	public int register(Bean ub) {
		try {
			
			Connection con = DBconnection.getCon();
			PreparedStatement pst = con.prepareStatement
					("insert into UserReg38 values (?,?,?,?,?,?,?");
			pst.setString(1, ub.getUname());
			pst.setString(2,ub.getPword());
			pst.setString(3,ub.getFname());
			pst.setString(4, ub.getLname());
			pst.setString(5,ub.getAddr());
			pst.setString(6, ub.getMid());
			pst.setLong(7, ub.getPhone());
		}catch(Exception e) { e.printStackTrace(); }
		return k;
	}
}
