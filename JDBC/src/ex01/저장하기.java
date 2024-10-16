package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class 저장하기 {

	public static void main(String[] args) {

		// 2번, 3번 코드 적고 "연결성공" 뜨우기
		
		// Java와 DataBase 연결(Connetion)하기
		// 1. mysql-connetor.jar 임포트하기 (프로젝트당 한개만)
		// 2. Driver 로딩하기

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.168.0.88/maplestory?serverTimezone=UTC";
			String id = "root";
			String pw = "1234";
			
			// 3. Connection 객체 얻어내기
			
			Connection con = DriverManager.getConnection(url, id, pw);
			if (con == null) {
				System.out.println("연결실패");
			} else {
				System.out.println("연결성공");
			}
			

			// 쿼리(insert, select, delete)문 전송하기
			// 4.쿼리문 준비
			String sql = "insert into maplestory values(1, '피곤하다', 10, 10, 10, 10)";
			
			// 5.preparedStatement 객체 얻어내기
			PreparedStatement psmt = con.prepareStatement(sql);
			
			// 6.쿼리문 전송
			int row = psmt.executeUpdate();
			//행이 추가되면 데이터가 추가되는것
			//열이 추가되면 속성이 추가되는것
			
			// 7.결과받기
			if (row > 0) {
				System.out.println("입력잘됌");
			}
			// 8.5번, 3번에서 얻어낸 객체들 닫기 - 객체를 닫아야 commit이 됌
			psmt.close();
			con.close();
			//늦게 얻어낸 객체를 먼저 닫음a
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("경로 오타");
		} catch (SQLException e) {
			System.out.println("데이터베이스 오타");
		}
	}
	// try/catch 는 트라이 안에서 예외 발생시 catch 에 상응하는
	// 예외가 있다면 즉시 catch로 이동해서 콘솔에 표시해줌
	// 모든 예외의 최상위 클래스는 Exception 이라서
	// Exception 으로 모든 예외 잡아낼 수 있음

}
