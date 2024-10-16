package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class 불러오기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/maplestory?serverTimezone=UTC";
			String id = "root";
			String pw = "1234";
			Connection con = DriverManager.getConnection(url, id, pw);
			if(con==null) {
				System.out.println("연결실패");
			}else {
				System.out.println("연결성공");
			}
			
			String sql = "select * from maplestory";
			
			PreparedStatement psmt = con.prepareStatement(sql);
			
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt(1);
				String nick = rs.getString(2);
				int str = rs.getInt(3);
				int dex = rs.getInt(4);
				int intel = rs.getInt(5);
				int luck = rs.getInt(6);
				
				System.out.println(num+", "+nick+", "+str+", "+dex+", "+intel+", "+luck+", ");
			}
			
			rs.close();
			psmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
