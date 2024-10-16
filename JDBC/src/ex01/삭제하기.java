package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class 삭제하기 {

	public static void main(String[] args) {
				// Java와 DataBase 연결(Connetion)하기
				// 1. mysql-connetor.jar 임포트하기 (프로젝트당 한개만)
				// 2. Driver 로딩하기

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/maplestory?serverTimezone=UTC";
			String id = "root";
			String pw = "1234";

			// 3. Connection 객체 얻어내기
			Connection conn = DriverManager.getConnection(url, id, pw);

			if (conn == null) {
				System.out.println("연결실패");
			} else {
				System.out.println("연결성공");
			}

			// 쿼리(insert, select, delete)문 전송하기
			// 4.쿼리문 준비
			String sql = "delete from maplestory where 번호 = 1";

			// 5.preparedStatement 객체 얻어내기
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 6.쿼리문 전송
			int row = psmt.executeUpdate();
			//행이 추가되면 데이터가 추가되는것
			//열이 추가되면 속성이 추가되는것
			
			// 7.결과받기
			if (row > 0) {
				System.out.println("입력잘됌");
			} else {
				System.out.println("삭제실패");
			}
			// 8.5번, 3번에서 얻어낸 객체들 닫기 - 객체를 닫아야 commit이 됌
			psmt.close();
			conn.close();
			//늦게 얻어낸 객체를 먼저 닫음
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("경로 오타");
		} catch (SQLException e) {
			System.out.println("데이터베이스 오타");
		}
	}

}
