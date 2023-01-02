package ex02;

public class Marine extends Unit implements IAttack {
	// implements --> 인터페이스
	public int hp;

	@Override
	public void attack() {
		System.out.println("마린 공격");	
	}

}
