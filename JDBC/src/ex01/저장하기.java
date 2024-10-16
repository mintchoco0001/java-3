package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class �����ϱ� {

	public static void main(String[] args) {

		// 2��, 3�� �ڵ� ���� "���Ἲ��" �߿��
		
		// Java�� DataBase ����(Connetion)�ϱ�
		// 1. mysql-connetor.jar ����Ʈ�ϱ� (������Ʈ�� �Ѱ���)
		// 2. Driver �ε��ϱ�

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.168.0.88/maplestory?serverTimezone=UTC";
			String id = "root";
			String pw = "1234";
			
			// 3. Connection ��ü ����
			
			Connection con = DriverManager.getConnection(url, id, pw);
			if (con == null) {
				System.out.println("�������");
			} else {
				System.out.println("���Ἲ��");
			}
			

			// ����(insert, select, delete)�� �����ϱ�
			// 4.������ �غ�
			String sql = "insert into maplestory values(1, '�ǰ��ϴ�', 10, 10, 10, 10)";
			
			// 5.preparedStatement ��ü ����
			PreparedStatement psmt = con.prepareStatement(sql);
			
			// 6.������ ����
			int row = psmt.executeUpdate();
			//���� �߰��Ǹ� �����Ͱ� �߰��Ǵ°�
			//���� �߰��Ǹ� �Ӽ��� �߰��Ǵ°�
			
			// 7.����ޱ�
			if (row > 0) {
				System.out.println("�Է��߉�");
			}
			// 8.5��, 3������ �� ��ü�� �ݱ� - ��ü�� �ݾƾ� commit�� ��
			psmt.close();
			con.close();
			//�ʰ� �� ��ü�� ���� ����a
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("��� ��Ÿ");
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ��Ÿ");
		}
	}
	// try/catch �� Ʈ���� �ȿ��� ���� �߻��� catch �� �����ϴ�
	// ���ܰ� �ִٸ� ��� catch�� �̵��ؼ� �ֿܼ� ǥ������
	// ��� ������ �ֻ��� Ŭ������ Exception �̶�
	// Exception ���� ��� ���� ��Ƴ� �� ����

}
