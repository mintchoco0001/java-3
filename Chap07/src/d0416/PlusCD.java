package d0416;

import java.util.Random;

public class PlusCD extends CD {
	
	//����Ŭ������ �Ű������� �ִ� �����ڰ� �ִٸ�
	//����Ŭ������ �ݵ�� ������ �����ؾ���

	public PlusCD(int life, String[] msg, int max) {
		super(life, msg, max);
	}



	public void makeNum() {
		a = new Random().nextInt(max) + 1;
		b = new Random().nextInt(max) + 1;
	}



	public String getQuestion() {
		return a + "+" + b + "=";
	}

	public boolean isOk(int c) {
		return a + b == c;
	}

	

}// Ŭ���� ��
