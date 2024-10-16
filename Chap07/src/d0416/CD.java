package d0416;

public abstract class CD {
	//public ���� �ϱ⿣ ������ ���輺 private �� �ϱ⿣ �ٸ� Ŭ�������� ��� �Ұ���
	//�׷��� ���� Ŭ���������� ��� �� �� �ֵ�Ȥ protected�� ������ ����
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
	
	//final ������ ��� ���� �Ұ���
	//��) Ŭ���� �տ��� ��� �Ұ��� ���� �տ� ������ �������� �Ұ��� ��
	//    ���������� ���̸� �������̵� �Ұ���
	final public int getlife() {
		return life;
	}
	public abstract String getQuestion();
	public abstract boolean isOk(int c);
	final public String getMsg(int i) {
		return msg[i];
	}
}
