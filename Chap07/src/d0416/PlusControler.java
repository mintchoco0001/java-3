package d0416;

import java.util.Random;
import java.util.Scanner;

public class PlusControler {
	// ���� ���ӱ�
	//PlusCD cd;
	//ó���� PlusCD ������ ��Ʈ�ѷ� ����
	CD cd;
	//�̷��� �԰��� ���߰� �Ǹ鼭 ���������� �ʰ� ��
	// ���ӱ� ���� �Ҷ� ȣ���ؾ���
	// ������ �޼ҵ� �Ű����� �����ؼ� ���� �޾ƾ� ��

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
				System.out.println("����!");
			} else {
				System.out.println(cd.getMsg(i));
				i++;
			}
		}
		System.out.println("Game Over!!");

	}// play ��

}// class ��
