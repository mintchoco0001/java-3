package d0415;

public class Sub3 implements Super {
//	extends�� Ŭ���� ��ӹ����� implements�� �������̽� ��ӹ�����
//	������ ���� ���� �߻�Ŭ������ ������ �������̽� �̹Ƿ� implements
//	������ ���� �ϳ��� ������ extends ���
	
	@Override
	public void make����() {
		// �߻�Ŭ������ ��ӹ޴� Ŭ������ �ݵ�� �߻�Ŭ������ Overriding �ؾ��Ѵ�
		// Overiding ���� �������� �ڽŵ� �߻�Ŭ�����̸� �ȴ�
		// ������ ������

		System.out.println("��󵵿� ��︮�� ���� ������");
	}

	public void ��ġ() {
		System.out.println("������ �� ���� ��ġ");
	}

}
