package what;
//혹시 이거 될까요?
//인스턴스를 하나만 만들기 가능?
//	ctrl + shift + L 이클립스 전체 단축키
public class What {
	public static void main(String[] args) {
//		static 안 붙은 메소드는 객체 생성 후에 실행해야 합니다.
//		static 붙은 메소드는 객체 없이 클래스명.메소드명으로 실행
		Human h1 = Human.getInstance();
		Human h2 = Human.getInstance();
		Human h3 = Human.getInstance();
		Human h4 = Human.getInstance();
		System.out.println(h1 == h2);
	}

}

// 데이터베이스 연결 (p243)
class Human{  // class 앞에는 public과 default만 올 수 있다
	private static Human human = new Human();
	
	private Human() {	}
	
	public static Human getInstance() {
		return human;
	}
}






