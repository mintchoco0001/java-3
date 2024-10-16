package ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
//		Data Access Object
//		DB�ٷ�� ��ü
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
				System.out.println("���Ἲ��");
//				�����ڰ� Ȯ���ϴ� �޼��� �α�
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

//			sql ���� �� ���� ? �� ǥ����
//			String �̶� ''�� ������ ����
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
			System.out.println("�����ͺ��̽� ��Ÿ");
		}finally {
			// Exception�� �ִ��� �޵�� �ѹ��� �鸣�� ��
			close();
		}

		return 0;
	}

	public int delete(int num) {
		connect();

		try {
			String sql = "delete from maplestory where ��ȣ = ?";

			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("��������");
			}

			return row;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("��������");
		} finally {
			// Exception�� �ִ��� �޵�� �ѹ��� �鸣�� ��
			close();
		}
		return 0;
	}// delete ��

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

//			VO�� ���� �ٸ� �ڷ��� �� �������� ���鶧
//			ArrayList �� �Ȱ��� �ڷ��� ���� �ø��ų� ���̱� ����
//			DB �� �ϳ� ==> VO
//			DB ���̺� ��ü => ���� ������ => VO�� ������ => ArrayList<VO>
				DTO temp = new DTO(num, nick, str, dex, intel, luck);
				all.add(temp);
			}
			return all;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			// Exception�� �ִ��� �޵�� �ѹ��� �鸣�� ��
			close();
		}
		return all;
	}//
}
