public class Scv extends Unit {
	@Override
	public void work() {
		System.out.println(this.name+" 총을 쏜다");
	}
	
	public static void main(String[] args) {
		Scv scv1 = new Scv();
		scv1.name = "SCV1";
		scv1.hp = 100;
		scv1.work();
	}
}