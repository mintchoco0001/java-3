package ����;

import java.util.Random;
import java.util.Scanner;

public class MainMinus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int life = 5;
		String[] msg = {"����1","����2","����3","����4","����5"};
		
		
		for (int i = 0; i < life;) {
			int a = new Random().nextInt(100)+1;
			int b = new Random().nextInt(a)+1;
			System.out.println(a+"-"+b+"=");
			int c = sc.nextInt();
			if(a-b==c) {
				System.out.println("����!");
			}else {
				System.out.println(msg[i]);
				i++;
			}
		} 
		System.out.println("Game Over!!");
	}
}
