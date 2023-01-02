import java.util.ArrayList;

public class Person {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.price = 100;
		
		Car car = new Car();
		car.price = 2000;
		
		// 10개면 100개면 
		// Tv와 Car를 추상화시켜 공통분모를 찾아보자
		// 상품이라는 공통분모를 만들자(추상화)
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(tv); // 제너릭이 Product타입이니까 tv, car 가능 -> 다형성
		list.add(car);
		int total = 0;
		for(Product p : list) {
			total += p.price;
		}
		System.out.println(total);
	}
}
