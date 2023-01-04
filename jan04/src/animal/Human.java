package animal;

import java.util.Scanner;

public class Human extends Animal{
	private String ssn;
	final static int num =101;
	static int check = 500;
	
	
	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		ssn=ssn.replace("-", "");
//			모자란 자리수 만큼 *로 입력해서 저장하기
		while(ssn.length() < 13) {
			ssn += "*";
		}
		this.ssn=ssn;
	}


	//	add()
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	
	@Override
	public void sound() {
//		super.sound();
		System.out.println("아... 추움...");
	}
	
	public static void main(String[] args) {
		Human human = new Human();
		
		Human.check = 5000; // static 붙은 녀석들은 클래스명.변수명으로 
//		human.check =100; 이건 위에 때문에
//		Human.num =15015; 이건 final때문에 오류
		
		int result = human.add(15, 30);
//		human.ssn = "주민번호";
		human.setSsn("840411");//저장
		System.out.println(human.getSsn()); //출력		
		
		
	}


	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	
	
}
