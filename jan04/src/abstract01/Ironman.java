package abstract01;

public class Ironman extends Hero{
	String javis;
	
	public void callJavis() {
		System.out.println("javis, 슈트 만들어.");
	}
	
	
	
	@Override
	public void attack() {
		System.out.println("레이저 공격");
	}

	@Override
	public void defense() {
		
	}
	
}
