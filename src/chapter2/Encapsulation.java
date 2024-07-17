package chapter2;


// 캡슐화: 인스턴스 필드와 메서드를 묶어서 필드에 대한 조작을 메서드를 통해서만 하도록 하는 방법
// 정보 은닉과 데이터 보호, 데이터 무결성을 보장할 수 있음 
class Player{
	

	private String birth; 
	private int body;
	private String academic;
	private String carrer;
	
	public Player(String birth, int body, String academic, String carrer ) {
		
//		 
		super();
		this.birth = birth;
		this.body = body >= 0 ? body : 160;
		this.academic = academic;
		this.carrer = carrer;	
	}
	
	public String getBirth() {
		return this.birth;
	}
	public int getBody() {
		return this.body;
	}

	public String getAcademic() {
		return this.academic;
	}

	public String getCarrer() {
		return this.carrer;
	}
	
	public void setBody(int body) {
		this.body = body >= 0 ? body : 160;
	}

	public void setCarrer(String carrer) {
		this.carrer = carrer;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
	Player kjd = new Player("2004.04.12. 서울 특별시",176, "경북일고등학교" ,"2023 항저우 양궁 국가대표");
	System.out.println(kjd.getBirth());
	System.out.println(kjd.getBody());
	System.out.println(kjd.getAcademic());
	System.out.println(kjd.getCarrer());
	
	kjd.setBody(-177);
	kjd.setCarrer("2024 파리 양궁 국가대표");
	System.out.println(kjd.getBody());
	System.out.println(kjd.getCarrer());
	}

}
