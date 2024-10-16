package d0416;

import java.util.Random;
import java.util.Scanner;

public class PlusControler {
	// 덧셈 게임기
	//PlusCD cd;
	//처음엔 PlusCD 전용의 콘트롤러 였는
	CD cd;
	//이렇게 규격을 맞추게 되면서 의존적이지 않게 됌
	// 게임기 실행 할때 호출해야함
	// 생성자 메소드 매개변수 설계해서 전달 받아야 함

	public PlusControler(CD cd) {

		this.cd = cd;
	}

	public void play() {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < cd.getlife();) {
			cd.makeNum();
			System.out.println(cd.getQuestion());
			int c = sc.nextInt();
			if (cd.isOk(c)) {
				System.out.println("성공!");
			} else {
				System.out.println(cd.getMsg(i));
				i++;
			}
		}
		System.out.println("Game Over!!");

	}// play 끝

}// class 끝
