package d0416;

import java.util.Random;

public class ���ϱ� extends CD {

	public ���ϱ�(int life, String[] msg, int max) {
		super(life, msg, max);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNum() {
		a=new Random().nextInt(max) +1;
		b=new Random().nextInt(max) +1;
	}

	@Override
	public String getQuestion() {
		return a + "*" + b + "=";
	}

	@Override
	public boolean isOk(int c) {
		return a * b == c;
	}

}
