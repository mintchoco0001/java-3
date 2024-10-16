package d0415;

public interface Super {
	//모든 Sub(하위)가 메소드를 오버라이딩 하고 있는 상태
	//Super(상위)에서 구체적 메소드 설계할 필요 없어짐 
	//=> 추상메소드로 만들자
	//=> 추상메소드를 하나 이상 보유한 (추상클래스)
	public void make국밥();
	
	public void 김치();
	
	//추상매소드 + 일반 메소드 = 추상클래스
	//Only 추상메소드 = 인터페이스
	
	//추상메소드만 들어갈때는 abstract 다 생략가능
}
