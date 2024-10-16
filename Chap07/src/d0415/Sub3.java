package d0415;

public class Sub3 implements Super {
//	extends는 클래스 상속받을때 implements는 인터페이스 상속받을때
//	물려줄 것이 없이 추상클래스만 있으면 인터페이스 이므로 implements
//	물려줄 것이 하나라도 있으면 extends 사용
	
	@Override
	public void make국밥() {
		// 추상클래스를 상속받는 클래스는 반드시 추상클래스를 Overriding 해야한다
		// Overiding 하지 않으려면 자신도 추상클래스이면 된다
		// 구현의 강제성

		System.out.println("경상도에 어울리는 국밥 레시피");
	}

	public void 김치() {
		System.out.println("적당히 잘 만든 김치");
	}

}
