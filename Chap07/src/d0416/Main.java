package d0416;

public class Main {

	public static void main(String[] args) {

		// �����ڰ� �ۼ��ϴ� ����

		// 1. ���� cd ����
		PlusCD cd = new PlusCD(1, new String[] { "������" }, 999);
		// 2. ���ӱ� ���� (1.���� ������� cd �Ű������� ���޹�����)
		PlusControler cont = new PlusControler(cd);
		// 3. ���ӱ� play();
		cont.play();

		// ���� faramwork
		// 1. ���� cd
		// 2. ���ӱ�
		// 3. ���� �԰�
		
		MinusCD cd2 = new MinusCD(1, new String[] {"������"}, 999);
		PlusControler cont2 = new PlusControler(cd2);
		cont2.play();
		
		���ϱ� cd3 = new ���ϱ� (1, new String[] {"������"},10);
		PlusControler cont3 = new PlusControler(cd3);
		cont3.play();
	}

}
