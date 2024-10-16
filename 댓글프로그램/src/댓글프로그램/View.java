package 댓글프로그램;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();
		while (true) {
			System.out.println("[1]글작성 [2]검색 [3]전체목록");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("댓글달기");
				System.out.print("작성자 >>");
				String writer = sc.next();
				System.out.println("내용 >>");
				String comment = sc.next();
				int row = dao.Insert(writer, comment, 0, 0);
			}
			if (choice == 2) {
				System.out.println("검색하기");
				String keyword = sc.next();
				ArrayList<DTO> data = dao.search(keyword);

				for (DTO temp : data) {
					System.out.println(temp);
				}
			}
			if (choice == 3) {
				System.out.println("전체목록보기");
				ArrayList<DTO> alldata = dao.Select();
				for (DTO temp : alldata) {
					System.out.println(temp);
				}

			}
		}
	}
}
