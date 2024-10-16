package d0412;

public class PoketmonMain {

	public static void main(String[] args) {
		Poketmon d = new Pika();
		Poketmon d2 = new Kko();
		Machine(d); // 피카츄 인형뽑기
		System.out.println();

	}// Main 끝

	public static void Machine(Poketmon doll) {

		doll.pick();
//		업캐스팅 되어있는 객체가 원래 무슨타입이었는지 알아내는 제한자는 instanceof 라고 함
//		if (doll instanceof Pika) {
//			Pika d = (Pika)doll;
//			d.pikaPick();
//		}else {
//			Kko d2 = (Kko)doll;
//			d2.kkoPick();
//		}
	}

}// 클래스 끝
