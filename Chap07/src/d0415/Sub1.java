package d0415;

public class Sub1 implements Super {
//	extends는 클래스 상속받을때 implements는 인터페이스 상속받을때
	
	public void make수육() {
		System.out.println("잡내없는 수육레시피");
	}

	@Override
	public void make국밥() {
		System.out.println("더 맛있는 순대국밥 레시피");
	}

	// 수정 활 순대국밥 레시피

	public void 김치() {
		System.out.println("김치인척 하는 빨간야채");
	}

	// 오버로딩 종복정의 =>메소드 이름을 중복정의
	// 오버라이딩 재정의 =>상위 클래스의 메소드를 재정의
}
