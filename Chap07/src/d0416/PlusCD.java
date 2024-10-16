package d0416;

import java.util.Random;

public class PlusCD extends CD {
	
	//상위클래스에 매개변수가 있는 생성자가 있다면
	//하위클래스에 반드시 생성자 설계해야함

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

	

}// 클래스 끝
