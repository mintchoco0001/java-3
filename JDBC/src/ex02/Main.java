package ex02;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
//	View
//	입출력담당
	public static void main(String[] args) {

		DAO maple_dao = new DAO();

		Scanner sc = new Scanner(System.in);
		System.out.println("메이플 캐릭터 생성기");

		while (true) {
			System.out.println("[1]추가 [2]전체조회 [3]검색 [4]삭제");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("추가합니다");

				System.out.println("번호");
				int num = sc.nextInt();

				System.out.println("닉네임");
				String nick = sc.next();

				int str = new Random().nextInt(9) + 1;
				int dex = new Random().nextInt(9) + 1;
				int intel = new Random().nextInt(9) + 1;
				int luck = new Random().nextInt(9) + 1;

				int row = maple_dao.Insert(num, nick, str, dex, intel, luck);

				if (row > 0) {
					System.out.println("저장됌");
				}

			} else if (choice == 2) {
				System.out.println("전체조회합니다");
				ArrayList<DTO> alldata = maple_dao.select();
			} else if (choice == 3) {
				System.out.println("검색합니다");
			} else if (choice == 4) {
				System.out.println("삭제합니다");
				System.out.println("삭제 할 번호");
				int num = sc.nextInt();
				int row = maple_dao.delete(num);
				System.out.println(row+"번 삭제했습니다");
				
				
			}else {
				System.out.println("잘못입력했습니다");
			}
		}
	}

}//클래스 끝
