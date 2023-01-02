public abstract class Unit { 
// 추상메서드를 가진 클래스는 추상 클래스가 된다
// abstract 키워드 사용

	public String name;
	public int hp;
	
	// 구현부가 없는 메서드를 추상메서드라고 한다
	// abstract 키워드 사용
	public abstract void work(); 
	
	public static void main(String[] args) {
		
		// 1) 추상클래스는 객체를 만들 수 없다
		// --> 추상클래스 추상메서드를 가진다
		// --> 추상메서드는 메서드의 구현부가없다
		//	Unit u = new Unit(); 
	}
}