package d0415;

public class Main {

	public static void main(String[] args) {
		
//		Super store1 = new Super();
		//Super�� ���Կ��� ���ϴ� ��� Super
//		store1.make����();//Super ������
		
		Sub1 store2 = new Sub1();
		//Sub1�� ���Կ��� ���ϴ� ��� Sub1
		store2.make����();//Super ������
		
		//store1 ������ ���� ����Ŵ
		//������ Sub1������ ������ ����
		//store2���� ���뱹�� �ȱ� �ȴٰ� ������ �� ����
		
		Super store3 = new Sub1();
		//Super ���Կ��� ���ϴ� ��� Sub1
		//���� Sub1�� Super�� ��ӹް� �־
		
//		Sub1 store4 = new Super();
//		Sub1�� ���Կ��� Super�� ���ϴ°� �Ұ���
		
		store3.make����();
		//Sub1�� �����Ƿ� ����.
		//Sub1�� �����Ǹ� ������(���׷��̵�) �س��� ����

		//���ɽ��� �Ǿ��ִ� ���¿��� ����Ŭ�������� ���� ���� �޼ҵ� ȣ��� �ٿ��ɽ��� �ʿ��ϴ�.
		((Sub1)store3).make����();
		
		
		Sub2 store4 = new Sub2();
		//���� (Super�� ������) ���� ���׷��̵� ���ؼ�
		
		Super store5 = new Sub2();
		//���� (Super�� ������) ���������� ���׷��̵� ���ؼ�
		
//		Super store6 = new Super();
		//���� �Ұ��� ����.... �̿ϼ��� �޼ҵ带 �����ϰ� �ֱ� ������
		//��ĳ���� �ٿ�ĳ���� �뵵�θ� ���
		//�� �̻� Super�� ���Ը� ���� �� ���� ��밡 ��
		
		
		
	}

}
