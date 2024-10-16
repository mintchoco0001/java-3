package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class 연결하기 {
	public static void main(String[] args) {
		// Java와 DataBase 연결(Connetion)하기
		// 1. mysql-connetor.jar 임포트하기 (프로젝트당 한개만)
		// 2. Driver 로딩하기
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.168.0.88/maplestory?serverTimezone=UTC";
			String id = "root";
			String pw = "1234";

			Connection conn = DriverManager.getConnection(url, id, pw);

			if (conn == null) {
				System.out.println("연결실패");
			} else {
				System.out.println("연결성공");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 경로 오류");
		} catch (SQLException e) {
			System.out.println("데이터베이스 오타");
		}

		// try/catch 는 트라이 안에서 예외 발생시 catch 에 상응하는
		// 예외가 있다면 즉시 catch로 이동해서 콘솔에 표시해줌
		// 모든 예외의 최상위 클래스는 Exception 이라서
		// Exception 으로 모든 예외 잡아낼 수 있음

		// 3. Connection 객체 얻어내기

		// 쿼리(insert, select, delete)문 전송하기
		// 4.쿼리문 준비
		// 5.preparedStatement 객체 얻어내기
		// 6.쿼리문 전송
		// 7.결과받기
		// 8.5번, 3번에서 얻어낸 객체들 닫기

	}
}
