package chapter2;


class MyMath{
	
	// 기준
	int add (int a, int b) {
		return a + b;
	}
	// 1.매개변수 타입이 다를 때
	
	double add (double a, double b) { //Overloading
		return a + b;
	}
	// 2.매개변수 갯수가 다를 때
	int add(int a) {
		return a+10;
	}
	// 3.매개변수타입의 조합이 다를 때
	double add(int a, double b) {
		
		return a + b;
	}
	double add(double a, int b) {
		return a + b;
	}	
	// 오버로딩이 안되는 경우
	// 1. 반환타입만 다를 경우
//	double add(int a, int b) {
//		return a + b;
//	}
	// 2. 매개변수 이름만 다를 경우
	
//	int add(int x, int y) {
//		return x + y;
//	}
	
	
}

public class Oveload {
	
	// Overloading : 같은 클래스 내부에서 같은 이름의 메서드를 여러개 작성할 수 있도록 하는 방법
	// 오버로딩의 조건
	// - 메소드의 이름은 같아야 하지만 매개변수의 타입, 개수 , 순서 중 하나는 달라야함
	// - 메서드의 반환타입과 매개변수의 이름은 영향을 주지 않음
	 
	
	
	public static void main(String[] args) {
		
		MyMath math = new MyMath();

		System.out.println(math.add(4, 5));
		int result1 = math.add(1, 2);
		double result2 = math.add(1.0, 2.0);
		

	}

}
