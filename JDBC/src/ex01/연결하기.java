package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class �����ϱ� {
	public static void main(String[] args) {
		// Java�� DataBase ����(Connetion)�ϱ�
		// 1. mysql-connetor.jar ����Ʈ�ϱ� (������Ʈ�� �Ѱ���)
		// 2. Driver �ε��ϱ�
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.168.0.88/maplestory?serverTimezone=UTC";
			String id = "root";
			String pw = "1234";

			Connection conn = DriverManager.getConnection(url, id, pw);

			if (conn == null) {
				System.out.println("�������");
			} else {
				System.out.println("���Ἲ��");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ��� ����");
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ��Ÿ");
		}

		// try/catch �� Ʈ���� �ȿ��� ���� �߻��� catch �� �����ϴ�
		// ���ܰ� �ִٸ� ��� catch�� �̵��ؼ� �ֿܼ� ǥ������
		// ��� ������ �ֻ��� Ŭ������ Exception �̶�
		// Exception ���� ��� ���� ��Ƴ� �� ����

		// 3. Connection ��ü ����

		// ����(insert, select, delete)�� �����ϱ�
		// 4.������ �غ�
		// 5.preparedStatement ��ü ����
		// 6.������ ����
		// 7.����ޱ�
		// 8.5��, 3������ �� ��ü�� �ݱ�

	}
}
