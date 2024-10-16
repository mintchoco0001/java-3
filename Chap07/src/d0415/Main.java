package d0415;

public class Main {

	public static void main(String[] args) {
		
//		Super store1 = new Super();
		//Super네 가게에서 일하는 사람 Super
//		store1.make국밥();//Super 레시피
		
		Sub1 store2 = new Sub1();
		//Sub1네 가게에서 일하는 사람 Sub1
		store2.make국밥();//Super 레시피
		
		//store1 에서는 수육 못시킴
		//수육은 Sub1에서만 생성된 것임
		//store2에서 순대국밥 팔기 싫다고 제거할 수 없음
		
		Super store3 = new Sub1();
		//Super 가게에서 일하는 사람 Sub1
		//가능 Sub1가 Super를 상속받고 있어서
		
//		Sub1 store4 = new Super();
//		Sub1의 가게에서 Super가 일하는건 불가능
		
		store3.make국밥();
		//Sub1의 레시피로 만듦.
		//Sub1이 레시피를 재정의(업그레이드) 해놨기 때문

		//업케스팅 되어있는 상태에서 하위클래스에서 새로 만든 메소드 호출시 다운케스팅 필요하다.
		((Sub1)store3).make수육();
		
		
		Sub2 store4 = new Sub2();
		//국밥 (Super의 레시피) 아직 업그레이드 안해서
		
		Super store5 = new Sub2();
		//국밥 (Super의 레시피) 마찬가지로 업그레이드 안해서
		
//		Super store6 = new Super();
		//이제 불가능 해짐.... 미완성된 메소드를 포함하고 있기 때문에
		//업캐스팅 다운캐스팅 용도로만 사용
		//더 이상 Super는 가게를 차릴 수 없는 상대가 됨
		
		
		
	}

}
