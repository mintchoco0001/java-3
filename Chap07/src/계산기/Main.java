package ����;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		�������� �����
//		1.��ǻ�ʹ� �������� 2���� ���ڸ� �̴´�
//		2.������ �ֿܼ� ����Ѵ�.
//		3.������ �Է¹޴´�.
//		4.���� ����ٸ� ����! Ʋ���ٸ� �ٺ���� ����Ѵ�
//		=>���ߵ� Ʋ���� ������ ����
//		5.��ȸ�� 3��. �� Ʋ�� Ƚ���� 3���̸� ��������
		Scanner sc = new Scanner(System.in);
		int life = 3;
		String[] msg = {"�� �����غ�", "������ �� �� �� �����ž�", "�ٺ�"};
		
		for (int i = 0; i < life;) {
			int a = new Random().nextInt(100)+1;
			int b = new Random().nextInt(100)+1;
			System.out.println(a+"+"+b+"=");
			int c = sc.nextInt();
			if(a+b==c) {
				System.out.println("����!");
			}else {
				System.out.println(msg[i]);
				i++;
			}
		} 
		System.out.println("Game Over!!");
// ������ ��
		
		
		
	
	}

}
