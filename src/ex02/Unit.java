package ex02;

public abstract class Unit {
	// 탱크와 마린 둘다 Unit이라는 전쟁도구로 추상화
	
	public int hp;
		
	public void move() {
		System.out.println("움직인다");
	}
}
