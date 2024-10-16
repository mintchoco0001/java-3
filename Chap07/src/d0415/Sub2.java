package d0415;

public class Sub2 implements Super {
//	extends는 클래스 상속받을때 implements는 인터페이스 상속받을때
	
	@Override
	public void make국밥() {
		System.out.println("우리동네 입맛에 맞는 순대국밥");
	}

	public void 김치() {
		System.out.println("맛있는 김치");
	}

}
