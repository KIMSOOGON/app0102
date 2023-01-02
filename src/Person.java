
public class Person {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.price = 100;
		
		Car car = new Car();
		car.price = 2000;
		
		System.out.println(tv.price+car.price);
		
		// 10개면 100개면 
		// Tv와 Car를 추상화시켜 공통분모를 찾아보자
	}
}
