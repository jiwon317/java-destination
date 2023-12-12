package ch06;

class Dog {
	String type;
	private String name;
	private int age;
	
	Dog(String type) {
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String displayDog() {
		return this.type + this.name + this.age;
	}
}



public class Ex_tmp_1212_2 {
	public static void main(String args[]) {
		Dog d1 = new Dog("푸들");
		d1.setAge(10);
		d1.setName("멍멍이");
		String displayDog = d1.displayDog();
		System.out.println(displayDog);
	}
}
