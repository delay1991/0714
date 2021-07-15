package co.micol.prj;

import java.sql.Connection;
import java.sql.DriverManager;

import co.micol.prj.vo.MemberVO;

public class DAO {
	private String driver="oracle.jdbc.driver.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user= "demo";
	private String password="1234";
	
	public Connection conn;
	
	public DAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결성공");
		}catch(Exception e) {
			System.out.println("DB연결이 안되었거나 클래스없음.");
		}
	}

	public MemberVO memberSelect1(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
			
}
