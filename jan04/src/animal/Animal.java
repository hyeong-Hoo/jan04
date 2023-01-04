package animal;
// 추상 클래스 (p329)
public abstract class Animal { // 부모에게도 안보이는 상위 클래스가 있다 Object
	protected int age;
	protected String name;
//	추상 메소드로 변신 -> 바디{}지우고 뒤에 ; public,void사이에 abstract 추가
	public abstract void sound(); //바디가 없어요.
	public abstract void add(); //강제
	
	public void thegaji() {
		
	}
	
	public void eat() {
		System.out.println("먹이를 먹습니다.");
	}
	
}
