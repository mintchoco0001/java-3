package ex02;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
//	View
//	����´��
	public static void main(String[] args) {

		DAO maple_dao = new DAO();

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ĳ���� ������");

		while (true) {
			System.out.println("[1]�߰� [2]��ü��ȸ [3]�˻� [4]����");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("�߰��մϴ�");

				System.out.println("��ȣ");
				int num = sc.nextInt();

				System.out.println("�г���");
				String nick = sc.next();

				int str = new Random().nextInt(9) + 1;
				int dex = new Random().nextInt(9) + 1;
				int intel = new Random().nextInt(9) + 1;
				int luck = new Random().nextInt(9) + 1;

				int row = maple_dao.Insert(num, nick, str, dex, intel, luck);

				if (row > 0) {
					System.out.println("�����");
				}

			} else if (choice == 2) {
				System.out.println("��ü��ȸ�մϴ�");
				ArrayList<DTO> alldata = maple_dao.select();
			} else if (choice == 3) {
				System.out.println("�˻��մϴ�");
			} else if (choice == 4) {
				System.out.println("�����մϴ�");
				System.out.println("���� �� ��ȣ");
				int num = sc.nextInt();
				int row = maple_dao.delete(num);
				System.out.println(row+"�� �����߽��ϴ�");
				
				
			}else {
				System.out.println("�߸��Է��߽��ϴ�");
			}
		}
	}

}//Ŭ���� ��
