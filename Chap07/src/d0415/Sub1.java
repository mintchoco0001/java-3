package d0415;

public class Sub1 implements Super {
//	extends�� Ŭ���� ��ӹ����� implements�� �������̽� ��ӹ�����
	
	public void make����() {
		System.out.println("�⳻���� ����������");
	}

	@Override
	public void make����() {
		System.out.println("�� ���ִ� ���뱹�� ������");
	}

	// ���� Ȱ ���뱹�� ������

	public void ��ġ() {
		System.out.println("��ġ��ô �ϴ� ������ä");
	}

	// �����ε� �������� =>�޼ҵ� �̸��� �ߺ�����
	// �������̵� ������ =>���� Ŭ������ �޼ҵ带 ������
}
