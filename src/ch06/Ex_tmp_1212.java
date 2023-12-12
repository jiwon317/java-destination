package ch06;

class Chair {
	String type;
	int numberOfLeg;
	
	Chair() {}
	
	Chair(String type) {
		this.type = type;
	}
	
	Chair(String type, int numberOfLeg) {
		this.type = type;
		this.numberOfLeg = numberOfLeg;
	}
	
	public String displayChair() {
		return "type: " + this.type + " number of leg: " + this.numberOfLeg;
	}
}

class Table {
	private String type;
	private int numberOfLeg;
	int width;
	
	Table () {
		
	}
	
	Table (int width) {
		this.width = width;
	}
	
//	Table (String type, int numberOfLeg, int width) {
//		this.type = type;
//		this.numberOfLeg = numberOfLeg;
//		this.width = width;
//	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setNumberOfLeg(int numberOfLeg) {
		this.numberOfLeg = numberOfLeg;
	}
	
	public int getNumberOfLeg() {
		return this.numberOfLeg;
	}
	
	public void displayTable() {
		System.out.println(this.type + ", " + this.numberOfLeg + ", " + this.width);
	}
}

public class Ex_tmp_1212 {
	public static void main(String[] args) {
		Chair c1 = new Chair();
		Chair c2 = new Chair("소파", 4);
		Chair c3 = new Chair("안마의자");
		
		System.out.println(c1.displayChair());
		System.out.println(c2.displayChair());
		System.out.println(c3.displayChair());
		
		Table t1 = new Table(10);
		t1.setType("식탁");
		t1.setNumberOfLeg(4);
		Table t2 = new Table(t1.width);
		t2.setType("모션데스크");
		t2.setNumberOfLeg(8);
		t1.displayTable();
		t2.displayTable();
		Table t3 = new Table(t2.width);
		t3.setType(t2.getType());
		t3.setNumberOfLeg(t2.getNumberOfLeg());
		t3.displayTable();
		
//		Table t3 = new Table(t2.type)
	}
}
  