package test;
import java.sql.*;


//Singleton class
public class DBconnection {
 private static Connection con = null;
 
 private DBconnection() {}
 static {
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver loaded");
				 con= DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:XE","system","Sadaf12");
				System.out.println("Connection established");
	 }catch(Exception e ) {e.printStackTrace();}
 }
 
 public static Connection getCon() {
	 return con;
 }
}
