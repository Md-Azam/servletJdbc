package test;
import java.io.*;
@SuppressWarnings("serial")
public class Bean implements Serializable  {
	private String Uname,Pword ,Fname ,Lname , Addr , Mid ;
	private long Phone ;
	public Bean() {}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getPword() {
		return Pword;
	}
	public void setPword(String pword) {
		Pword = pword;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getAddr() {
		return Addr;
	}
	public void setAddr(String addr) {
		Addr = addr;
	}
	public String getMid() {
		return Mid;
	}
	public void setMid(String mid) {
		Mid = mid;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	

}
