package ch07;

public class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (Car)fe;에서 형변환 생략
		//car.water(); Car타입 참조변수로 water()호출 불가
		fe2 = (FireEngine)car;
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}




