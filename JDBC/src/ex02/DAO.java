package ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
//		Data Access Object
//		DB다루는 객체
	private Connection con;
	private PreparedStatement psmt;
	private ResultSet rs;

	private void connect() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/maplestory?serverTimezone=UTC";
			String id = "root";
			String pw = "1234";

			con = DriverManager.getConnection(url, id, pw);
			if (con == null) {
				System.out.println("연결성공");
//				개발자가 확인하는 메세지 로그
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int Insert(int num, String nick, int str, int dex, int intel, int luck) {

		connect();
		try {

//			sql 문에 들어갈 값은 ? 로 표시함
//			String 이라도 ''로 감싸지 않음
			String sql = "insert into maplestory values(?, ?, ?, ?, ?, ?)";

			psmt = con.prepareStatement(sql);

			psmt.setInt(1, num);
			psmt.setString(2, nick);
			psmt.setInt(3, str);
			psmt.setInt(4, dex);
			psmt.setInt(5, intel);
			psmt.setInt(6, luck);
			int row = psmt.executeUpdate();

			
			return row;

		} catch (SQLException e) {
			System.out.println("데이터베이스 오타");
		}finally {
			// Exception이 있더라도 받드시 한번은 들르는 곳
			close();
		}

		return 0;
	}

	public int delete(int num) {
		connect();

		try {
			String sql = "delete from maplestory where 번호 = ?";

			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("삭제성공");
			}

			return row;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("삭제실패");
		} finally {
			// Exception이 있더라도 받드시 한번은 들르는 곳
			close();
		}
		return 0;
	}// delete 끝

	private void close() {
		try {

			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (con != null) {
				con.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<DTO> select() {
		connect();
		ArrayList<DTO> all = new ArrayList<>();
		try {
			String sql = "select * from maplestory";

			psmt = con.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				int num = rs.getInt(1);
				String nick = rs.getString(2);
				int str = rs.getInt(3);
				int dex = rs.getInt(4);
				int intel = rs.getInt(5);
				int luck = rs.getInt(6);

//			VO는 서로 다른 자료형 한 묶음으로 만들때
//			ArrayList 는 똑같은 자료형 갯수 늘리거나 줄이기 쉽게
//			DB 행 하나 ==> VO
//			DB 테이블 전체 => 행이 여러개 => VO가 여러개 => ArrayList<VO>
				DTO temp = new DTO(num, nick, str, dex, intel, luck);
				all.add(temp);
			}
			return all;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			// Exception이 있더라도 받드시 한번은 들르는 곳
			close();
		}
		return all;
	}//
}
