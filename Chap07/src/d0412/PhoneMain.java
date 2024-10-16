package d0412;

public class PhoneMain {

	public static void main(String[] args) {
		// 상속 실습 하는 Main
		
		피쳐폰 p1 = new 피쳐폰();
		p1.call();
		p1.send();
		
		스마트폰 s1 = new 스마트폰();
		s1.call();
		s1.send();
		s1.wifi();
		
//		하위클래스는 상위 클래스 타입으로 생성가능 그러나 반대는 불가능
		Phone p2= new 피쳐폰();
//		피쳐폰 타입의 객체가 폰타입으로 형변환 가능 (피쳐폰은 Phone을 상속받았기 때문에 가능)
//		하위클래스 타입의 객체가 상위클래스 타입으로 형변환 => 업캐스팅
		
		피쳐폰 p3 = (피쳐폰)p2;
//		그러나 p2 처럼 업캐스팅 되어있는 객체는 [원래 형태(타입으)로] 다운캐스팅 가능
		
//		스마트폰 s2 = (스마트폰)p3;
//		캐스팅 예외가 발동하면서 불가능함
		
		
	}

}
