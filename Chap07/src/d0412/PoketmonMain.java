package d0412;

public class PoketmonMain {

	public static void main(String[] args) {
		Poketmon d = new Pika();
		Poketmon d2 = new Kko();
		Machine(d); // ��ī�� �����̱�
		System.out.println();

	}// Main ��

	public static void Machine(Poketmon doll) {

		doll.pick();
//		��ĳ���� �Ǿ��ִ� ��ü�� ���� ����Ÿ���̾����� �˾Ƴ��� �����ڴ� instanceof ��� ��
//		if (doll instanceof Pika) {
//			Pika d = (Pika)doll;
//			d.pikaPick();
//		}else {
//			Kko d2 = (Kko)doll;
//			d2.kkoPick();
//		}
	}

}// Ŭ���� ��
