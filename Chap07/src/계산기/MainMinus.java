package 계산기;

import java.util.Random;
import java.util.Scanner;

public class MainMinus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int life = 5;
		String[] msg = {"오답1","오답2","오답3","오답4","오답5"};
		
		
		for (int i = 0; i < life;) {
			int a = new Random().nextInt(100)+1;
			int b = new Random().nextInt(a)+1;
			System.out.println(a+"-"+b+"=");
			int c = sc.nextInt();
			if(a-b==c) {
				System.out.println("성공!");
			}else {
				System.out.println(msg[i]);
				i++;
			}
		} 
		System.out.println("Game Over!!");
	}
}
