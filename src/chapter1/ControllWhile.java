package chapter1;
import java.util.Scanner;

public class ControllWhile {

	public static void main(String[] args) {
		
//		while문 : 반복할 횟수가 정해져 있지 않을 때 사용하는 반복문
//		조건이 true인 동안 반복, 조건이 false가 되면 반복 종료
//		while(조건식) {조건이 true일때 반복할 코드 블록}
		
		int count = 1;
		
		while (count <= 10) {	
			System.out.println(count);
			count++;
		}
		
		Scanner scan = new Scanner(System.in);
		// 사용자가 입력한 정수를 출력 (단, -1을 입력하면 출력후 반복을 종료)
		int user = 0;
		
		
		while (user != -1) {
			System.out.print("숫자 입력 : ");
			
			user = scan.nextInt();
			
			System.out.println("사용자가 입력한 숫자 " + user );
			
			
		}
		System.out.println("잘못 입력했습니다");
		System.out.println("종료하겠습니다");
		scan.close();

	}

}
