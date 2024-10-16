package d0416;

public abstract class CD {
	//public 으로 하기엔 수정될 위험성 private 로 하기엔 다른 클래스에서 사용 불가능
	//그러니 하위 클래스에서는 사용 할 수 있도혹 protected로 제한자 설정
	protected int life;
	protected String[] msg;
	protected int max;
	protected int a;
	protected int b;
	
	public CD(int life, String[] msg, int max) {
		this.life = life;
		this.msg = msg;
		this.max = max;
	}
	
	public abstract void makeNum();
	
	//final 붙으면 모든 변경 불가능
	//예) 클래스 앞에는 상속 불가능 변수 앞에 붙으면 변수변경 불가능 등
	//    접근제한자 앞이면 오버라이딩 불가능
	final public int getlife() {
		return life;
	}
	public abstract String getQuestion();
	public abstract boolean isOk(int c);
	final public String getMsg(int i) {
		return msg[i];
	}
}
