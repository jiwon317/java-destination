package ch06;

class Human {
	protected int idNumber;
	String name;
	String nation;
	
	Human() {}
	
	Human(String name, String nation) {
		this.name = name;
		this.nation = nation;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public String display() {
		return this.name + this.nation + this.idNumber;
	}
}

class SoccerPlayer extends Human {
	String position;
	
	SoccerPlayer(String name, String nation, String position) {
		super(name, nation);
		this.position = position;
	}
	
	public String display() {
		return super.display() + this.position;
	}
}

class Developer extends Human{
	String type;
	
	Developer(String name, String nation, String type) {
		super(name, nation);
//		super.name = name;
//		super.nation = nation;
		this.type = type;
	}
	
	public int getIdNumber() {
		return super.idNumber;
	}
	
	public String display() {
		return super.display() + this.type;
	}
	
//	public String displayDeveloper() {
//		return this.name + this.nation + this.idNumber;
//	}
}

class LolPlayer extends Human {
	int numberOfWorlds;
	private String[] champs;
	
	
	LolPlayer(String name, String nation, int numberOfWorlds) {
		super(name,nation);
		this.numberOfWorlds = numberOfWorlds;
	}
	
	public void setchamps(String[] champs) {
		this.champs = champs;
	}
	
	public String[] getchamps() {
		return this.champs;
	}
	
	
	public String display() {
		String champArray = "";
		
		for (int i = 0; i < this.champs.length; i++) {
			if (i < this.champs.length - 1) {
				champArray += champs[i] + ", ";
			} else {
				champArray += champs[i];
			}
		}
		return super.display() + this.numberOfWorlds + champArray + this.champs;
	}
}



public class Ex_tmp_1212_3 {
	public static void main(String args[]) {
		Human choi = new Human("최지원","남한");
		choi.setIdNumber(940317);
		Human choi2 = new Human("최원지","북한");
		choi2.setIdNumber(choi.getIdNumber());
		System.out.println(choi.display());
		System.out.println(choi2.display());
		
		Developer jiwon = new Developer("지원씨", "미국", "주니어개발자");
//		jiwon.getIdNumber();
		System.out.println(jiwon.display());
		
		SoccerPlayer Son = new SoccerPlayer("손흥민","한국","스트라이커");
		Son.setIdNumber(920317);
		System.out.println(Son.display());
		
		LolPlayer Faker = new LolPlayer("이상혁", "한국", 4);
		Faker.setIdNumber(960317);
		String[] champs = {"오리아나", "아지르"}; 
		Faker.setchamps(champs);
		System.out.println(Faker.display());
	}
}
 