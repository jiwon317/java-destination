package ch06;

class Materials {
	protected String 내일배움카드;
	String 의지;
	int 순공시간;
	
	Materials(String 내일배움카드,String 의지, int 순공시간) {
		this.내일배움카드 	= 내일배움카드;
		this.의지 		    = 의지;
		this.순공시간		= 순공시간;
	}
	
	public void set내일배움카드(String 내일배움카드) {
		this.내일배움카드 = 내일배움카드;
	}
	
	public String get내일배움카드() {
		return this.내일배움카드;
	}
	
	public String displayMaterials() {
		return this.내일배움카드 + this.의지 + this.순공시간;
	}
}

class ChoiJiWon extends Materials {
	String PossibilityOfSuccess;
	
	
	ChoiJiWon(String 내일배움카드, String 의지, int 순공시간, String PossibilityOfSuccess) {
		super(내일배움카드,의지, 순공시간);
		this.PossibilityOfSuccess = PossibilityOfSuccess;
	}
	
	public void set내일배움카드(String 내일배움카드) {
		this.내일배움카드 = 내일배움카드;
	}
	
	public String get내일배움카드() {
		return this.내일배움카드;
	}
	
	public String displayChoiJiWon() {
		return this.get내일배움카드() + this.의지 + this.순공시간 + this.PossibilityOfSuccess;
	}
}

class BootCamp {
	String nameOfAcademy;
	int coursePeriod;
	String position;
	
	BootCamp() {}
	BootCamp(String nameOfAcademy, int coursePeriod, String position) {
		this.nameOfAcademy = nameOfAcademy;
		this.coursePeriod  = coursePeriod;
		this.position		= position;
	}
	
	public String displayBootcamp() {
		return this.nameOfAcademy + this.coursePeriod + this.position;
	}
	
}

public class Ex_tmp_1214_1 {
	public static void main(String args[]) {
		BootCamp b1 = new BootCamp();
		BootCamp b2 = new BootCamp("스파르타코딩클럽",5,"backend");
		Materials m1 = new Materials("없음","박약",0);
		Materials m2 = new Materials("발급완료","무조건해낸다",10);
		ChoiJiWon c1 = new ChoiJiWon("준비완료","간절함",10,"성공할수있음");
		
		System.out.println(b1.displayBootcamp());
		System.out.println(b2.displayBootcamp());
		System.out.println(m1.displayMaterials());
		System.out.println(m2.displayMaterials());
		System.out.println(c1.displayChoiJiWon());
		
	}
}
