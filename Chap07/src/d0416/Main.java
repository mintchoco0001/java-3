package d0416;

public class Main {

	public static void main(String[] args) {

		// 개발자가 작성하는 공간

		// 1. 게임 cd 생성
		PlusCD cd = new PlusCD(1, new String[] { "끝났어" }, 999);
		// 2. 게임기 생성 (1.에서 만들어진 cd 매개변수로 전달받을것)
		PlusControler cont = new PlusControler(cd);
		// 3. 게임기 play();
		cont.play();

		// 게임 faramwork
		// 1. 게임 cd
		// 2. 게임기
		// 3. 게임 규격
		
		MinusCD cd2 = new MinusCD(1, new String[] {"끝났어"}, 999);
		PlusControler cont2 = new PlusControler(cd2);
		cont2.play();
		
		곱하기 cd3 = new 곱하기 (1, new String[] {"끝났어"},10);
		PlusControler cont3 = new PlusControler(cd3);
		cont3.play();
	}

}
