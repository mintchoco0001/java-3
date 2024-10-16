package 사칙연산;

import java.util.Scanner;

public class 나눗셈{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = addNumber(a, b);
		System.out.println("연산결과 : " + sum);
	}

	public static int addNumber(int a, int b) {
		int result = a/b;
		return result;
	}

}