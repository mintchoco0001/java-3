package ������α׷�;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();
		while (true) {
			System.out.println("[1]���ۼ� [2]�˻� [3]��ü���");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("��۴ޱ�");
				System.out.print("�ۼ��� >>");
				String writer = sc.next();
				System.out.println("���� >>");
				String comment = sc.next();
				int row = dao.Insert(writer, comment, 0, 0);
			}
			if (choice == 2) {
				System.out.println("�˻��ϱ�");
				String keyword = sc.next();
				ArrayList<DTO> data = dao.search(keyword);

				for (DTO temp : data) {
					System.out.println(temp);
				}
			}
			if (choice == 3) {
				System.out.println("��ü��Ϻ���");
				ArrayList<DTO> alldata = dao.Select();
				for (DTO temp : alldata) {
					System.out.println(temp);
				}

			}
		}
	}
}
