package abstract01;

public class Avengers {

	public static void main(String[] args) {
		
		Ironman ironman = new Ironman();
		Hulk hulk = new Hulk();
		Spiderman spiderman = new Spiderman();
		
//		ironman.attack();
//		hulk.attack();
//		spiderman.attack();
		
//		한꺼번에 공격 가능?
		Hero[] avan = new Hero[3];
		avan[0] = ironman;	// 부모타입이더라도 생성은 Ironman
		avan[1] = hulk;
		avan[2] = spiderman;
		for(int i = 0; i<avan.length;i++) {
			avan[i].attack();
		}
		
//		다형성
		Hero h1 = new Ironman();
		h1.attack(); //레이저 
		h1.defense();
		
		((Ironman)h1).javis ="";
		((Ironman)h1).callJavis();
		
		Ironman h2 = (Ironman) h1;
		h2.callJavis();
		// 부모타입, super타입으로 변환가능
		
		
		/*
		 * 다형성
		 * 다형성은 동적바인딩을 지원해야 합니다.
		 * 
		 * 런타임때 최종 타입이 결정되는 것.
		 * 
		 * 다형성의 한계 : 상위 클래스에 만들어진 메소드에 한해 가능
		 * 
		 * 
		 * 
		 */
		
	}

}
