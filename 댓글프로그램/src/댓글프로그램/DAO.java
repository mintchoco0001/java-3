package 댓글프로그램;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class DAO {
//	Connnect
//	Close
	private Connection con;
	private PreparedStatement psmt;
	private ResultSet rs;

//	1.jar
	private void connect() {
//		2.drive
//		3.connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/maplestory?serverTimezone=UTC";
			String id = "root";
			String pw = "1234";
			con = DriverManager.getConnection(url, id, pw);

			if (con != null) {
				System.out.println("연결성공");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	4.쿼리문준비
//	5.psmt
//	6.쿼리문 전송()
//	7.결과처리
//	8.닫기
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

	public int Insert(String writer, String comment, int i, int j) {
		connect();
		try {
			String sql = "insert into news values (?, ?, ?, ?)";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, writer);
			psmt.setString(2, comment);
			psmt.setInt(3, i);
			psmt.setInt(4, j);
			int row = psmt.executeUpdate();
			return row;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Exception이 있더라도 받드시 한번은 들르는 곳
			close();
		}
		return 0;
	}// insert 끝

	public ArrayList<DTO> Select() {
		connect();
		ArrayList<DTO> all = new ArrayList<>();
		try {
			String sql = "select * from news";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				String writer = rs.getString(1);
				String comment = rs.getString(2);
				int likes = rs.getInt(3);
				int hate = rs.getInt(4);

				DTO temp = new DTO(writer, comment, likes, hate);
				all.add(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Exception이 있더라도 받드시 한번은 들르는 곳
			close();
		}

		return all;
	}

	public ArrayList<DTO> search(String keyword) {
		connect();
		ArrayList<DTO> result = new ArrayList<>();

		try {
			String sql = "select * from news where writer = ?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, keyword);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String writer = rs.getString(1);
				String comment = rs.getString(2);
				int likes = rs.getInt(3);
				int hate = rs.getInt(4);

				DTO temp = new DTO(writer, comment, likes, hate);
				result.add(temp);
			}

			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			// Exception이 있더라도 받드시 한번은 들르는 곳
			close();
		}
		return null;
	}// search 끝

}
