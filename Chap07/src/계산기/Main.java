package 계산기;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		덧셉게임 만들기
//		1.컴퓨터는 랜덤으로 2개의 숫자를 뽑는다
//		2.문제를 콘솔에 출력한다.
//		3.정답을 입력받는다.
//		4.답을 맞춘다면 성공! 틀린다면 바보라고 출력한다
//		=>맞추든 틀리든 세문제 나옴
//		5.기회는 3번. 총 틀린 횟수가 3번이면 게임종료
		Scanner sc = new Scanner(System.in);
		int life = 3;
		String[] msg = {"잘 생각해봐", "다음엔 잘 할 수 있을거야", "바보"};
		
		for (int i = 0; i < life;) {
			int a = new Random().nextInt(100)+1;
			int b = new Random().nextInt(100)+1;
			System.out.println(a+"+"+b+"=");
			int c = sc.nextInt();
			if(a+b==c) {
				System.out.println("성공!");
			}else {
				System.out.println(msg[i]);
				i++;
			}
		} 
		System.out.println("Game Over!!");
// 선생님 답
		
		
		
	
	}

}
