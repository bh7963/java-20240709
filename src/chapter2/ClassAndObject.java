package chapter2;
import java.util.Arrays;

//클래스 : 공통된 속성과 기능을 정의해둔 것
//[접근제어자] class 클래스명 {속성 , 기능}

class ExampleClass1 {
//	속성 : 클래스가 가질 수 있는 정보나 상태
//	일반적으로 변수로 표현
	
//	인스턴스 변수 : 각 인스턴스마다 독립적으로 ㄱ밧을 가지는 변수
	int attribute1;
	double attribute2;

//	클래스 변수 : 해당 클래스로 생성된 모든 인스턴스가 공유하는 변수
//	필드 앞에 static 키워드를 사용하여 지정
//	인스턴스 없이 클래스로 직접 접근할 수 있음
//	반드시 인스턴스가 생성된 후에 사용할 수 있음
	static int staticAttribute;
	
//	기능 : 클래스가 가질 수 있는 행동이나 작업 (메서드)
//	[접근제어자] 반환티입 메서드명 (매개변수타입 매개변수명[, ...] )
//	{메서드의 기능 구현}
	
//	인스턴스 메서드 : 인스턴스를 생성한 후 사용할 수 있는 메서드
//	인스턴스 필드를 사용하는 기능에 대해서 인스턴스 메서드를 사용
	int method (int arg1) {
//		기능구현
//		반환티입이 void가 아니면 반드시 return으로 결과값을 반환해야함
		
		return arg1 * arg1;
	}

//	클래스 메서드 : 인스턴스 생성없이 클래스로만 호출 가능한 메서드
//	반환타입앞에 static 이라는 키워드를 붙여서 사용
//	인스턴스 필드를 사용하지 않는 메서드에 주로 사용됨
//	인스턴스 필드를 사용할 수 없음
	static void staticMethod() {
		//System.out.println(attribute1);
		//method(5);
	}
	
// 스마트폰 
// - 속성 : 제조사(String), 제조일자(String), 모델명(String), 전화번호(String), 어플리스트(String[]), 전원상태(boolean) 
// - 기능 : 전화걸기, 어플설치, 문자보내기, 휴대폰정보보기, 전원누르기
}
class SmartPhone{
	
//	스마트폰에 대한 속성
	String manufacturer;//제조사
	String manufactureDate; // 제조일자
	String modelName; // 모델명
	String telNumber; //전화번호
	String[] appList = new String[0]; //어플 리스트
	boolean powerStatus; // 전원상태

//	기능
	void printInfo () {
		System.out.println("=================정보=================");
		System.out.println("제조사 : " + manufacturer);
		System.out.println("제조날짜 : " + manufactureDate);
		System.out.println("모델명 : " + modelName);
		System.out.println("전화번호 : " + telNumber);
	}
	
	void call (String toTelNumber) {
		
		System.out.println(telNumber + "가" + toTelNumber + " 로 전화를 겁니다");
	}
	
	void appInstall (String appName) {
		
		String[] newAppList = new String[appList.length + 1];
		
		for(int i = 0; i < appList.length; i++) {
			newAppList[i] = appList[i];
		}
		newAppList[newAppList.length - 1] = appName;
		appList = newAppList;
		
	}
	
	void sendMsg (String toTelNumber, String message) {
		System.out.println(telNumber + "가 " + toTelNumber + "에게 " + message + "을 발송했습니다.");
	}
	
	void pressPowerButton () {
		
		powerStatus = !powerStatus;
		
	}
	
}

// 한국인
// =속성=
// -이름
// -나이
// -국적



class Korean {
		String name;
		int age;
		static String nationallity = "대한민국";
}
//	삼각함수
//	빗변을 구하기
//	둘레 구하기
//	sin 구하기
//	cos 구하기
//	tan 구하기

class TriangleMath{
	
	// PI, getCircleArea은 SRP(단일 책임 원칙)원칙에 위배됨
	static final double PI = 3.1415;
	
	static double getCircleArea (double radius) {
		if (radius <= 0) {
			return 0;
		}
		
		double area = radius * radius * PI;
		return area;
	}
	
	static double getHypotenuse(double bottom, double height) {
		
		if (bottom <=0 || height <= 0) {
			
			return 0;
	
		}
		
		double hypo2 = Math.pow(bottom, 2) + Math.pow(height, 2); 
		double hypo = Math.sqrt(hypo2);
		
		return hypo;
		
	}
	
	static double getRound(double side1, double side2, double side3) {
		
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			return 0;
		}
		double round = side1 + side2 + side3;
		
		return round;
	}
	
	static double getSin(double hypo, double height) {
		if (height <=0 || hypo <= 0) {
			return 0;
		}
		
		double sin = hypo / height;
		
		return sin;		
	}
	
	static double getCos(double hypo, double bottom) {
		if (bottom <=0 || hypo <= 0) {
			return 0;
		}
		
		double cos = hypo / bottom;
		
		return cos;		
	}
	
	static double getTan(double height, double bottom) {
		if (bottom <=0 || height <= 0) {
			return 0;
		}
		
		double tan = height / bottom;
		
		return tan;		
	}
	
	
}


public class ClassAndObject {
	
	
	public static void main(String[] args) {
		
//		인스턴스 : 특정 클래스로 정의된 것을 실체화한 객체
//		클래스명 참조변수명 = new 클래스명();
		ExampleClass1 instance1 = new ExampleClass1();
		ExampleClass1 instance2 = new ExampleClass1();
		
//		인스턴스가 가지고 있는 속성 접근 방법
//		인스턴스.속성명;
		instance1.attribute1 = 10;
		instance2.attribute2 = 2.5;

		System.out.println(instance1.attribute1);
		System.out.println(instance2.attribute2);
		
//		인스턴스가 가지고 있는 method호출 방법
//		인스턴스.method(매개변수, ...);
		
		int methodResult = instance1.method(5);
		System.out.println(methodResult);
		
		System.out.println("========================================");
		
		instance1.staticAttribute = 10;
		System.out.println(instance1.staticAttribute);
		System.out.println(instance2.staticAttribute);
		
		instance2.staticAttribute = 33;
		System.out.println(instance2.staticAttribute);
		System.out.println(instance1.staticAttribute);
		
		System.out.println(ExampleClass1.staticAttribute);
		
		
		
		SmartPhone iphone = new SmartPhone();
		SmartPhone galaxy = new SmartPhone();
		
		// iphone 속성
		iphone.manufacturer = "Apple";
		iphone.manufactureDate = "2024-07-12";
		iphone.modelName = "Iphone 13pro";
		iphone.telNumber = "010-1234-5678";
		iphone.powerStatus = false;
		// galaxy 속성
		galaxy.manufacturer = " Samsung";
		galaxy.manufactureDate = "2024-07-11";
		galaxy.modelName = "Galaxy S24 Ultra+";
		galaxy.telNumber = "010-9876-4321";
		galaxy.powerStatus = false;
		
		// iphone 메서드 호출
		
		iphone.printInfo();
		galaxy.printInfo();
//		iphone.call("010-1111-2222");
		iphone.sendMsg( "010-2222-3333", "안녕");
		galaxy.sendMsg( "010-2222-3333", "안녕");
		iphone.appInstall("카카오톡");
		iphone.pressPowerButton();
		System.out.println(Arrays.toString(iphone.appList));
		Korean korean1 = new Korean();
		Korean korean2 = new Korean();
		
		korean1.name = "홍길동";
		korean1.age = 17;
		
		
		korean2.name = "김철수";
		korean2.age = 26;
		
		System.out.println(korean1.nationallity);
		System.out.println(korean2.nationallity);
		
		korean2.nationallity = "한국";
		System.out.println(korean1.nationallity);
		System.out.println(korean2.nationallity);
		
		System.out.println("========================================");
		
//		double bottom = 3;
//		double height = 4;
//		double hypotenuse = ?;
	
		TriangleMath hypotenuse = new TriangleMath();
		
		double hypo = hypotenuse.getHypotenuse(3,4);
		System.out.println(hypo);
		
		double sin = TriangleMath.getSin(4, 5);
		double con = TriangleMath.getCos(3, 5);
		//double tan = TriangleMath.getTan();
		
		
			
		

	}
}

