package ��Ģ����;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = addNumber(a, b);
		System.out.println("������ : " + sum);
	}

	public static int addNumber(int a, int b) {
		int result = a*b;
		return result;
	}

}