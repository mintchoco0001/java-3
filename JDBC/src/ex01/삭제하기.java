package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class �����ϱ� {

	public static void main(String[] args) {
				// Java�� DataBase ����(Connetion)�ϱ�
				// 1. mysql-connetor.jar ����Ʈ�ϱ� (������Ʈ�� �Ѱ���)
				// 2. Driver �ε��ϱ�

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/maplestory?serverTimezone=UTC";
			String id = "root";
			String pw = "1234";

			// 3. Connection ��ü ����
			Connection conn = DriverManager.getConnection(url, id, pw);

			if (conn == null) {
				System.out.println("�������");
			} else {
				System.out.println("���Ἲ��");
			}

			// ����(insert, select, delete)�� �����ϱ�
			// 4.������ �غ�
			String sql = "delete from maplestory where ��ȣ = 1";

			// 5.preparedStatement ��ü ����
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 6.������ ����
			int row = psmt.executeUpdate();
			//���� �߰��Ǹ� �����Ͱ� �߰��Ǵ°�
			//���� �߰��Ǹ� �Ӽ��� �߰��Ǵ°�
			
			// 7.����ޱ�
			if (row > 0) {
				System.out.println("�Է��߉�");
			} else {
				System.out.println("��������");
			}
			// 8.5��, 3������ �� ��ü�� �ݱ� - ��ü�� �ݾƾ� commit�� ��
			psmt.close();
			conn.close();
			//�ʰ� �� ��ü�� ���� ����
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("��� ��Ÿ");
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ��Ÿ");
		}
	}

}
