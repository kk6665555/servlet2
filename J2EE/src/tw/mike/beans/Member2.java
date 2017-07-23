package tw.mike.beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



/*
 * JavaBean rules
 * 1. implements Serializable
 * 2. public class
 * 3. field member can not a public
 * 4. getter & setter => getXxx, setXxx => field xxx
 * 5. none argument Constructor (default Constructor)
 */

//public class Member  implements Serializable{
	public class Member2{
	private String account,password,realname,id;
	private Connection conn;
	private PreparedStatement pstmt;
	public Member2() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost/oneone","root","root");
		
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public boolean newInsert() throws Exception{
		pstmt=conn.prepareStatement("INSERT INTO member(account,password,realname) values(?,?,?)");
		pstmt.setString(1, account);
		pstmt.setString(2, password);
		pstmt.setString(3, realname);
		int n = pstmt.executeUpdate();
		return n > 0 ;
	}
	
	public boolean isValidMemeber() throws Exception {
		String sql = "select * from member where account=? and password=?";
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, account);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		boolean ret = rs.next();
		if(ret) {
			id=rs.getString("id");
			realname=rs.getString("realname");
		}
		return ret;
	}
	
}
	
