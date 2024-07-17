package practice;

import java.util.Scanner;

public class Practice1 {

	// 사용자로부터 0이상의 정수를 입력받고 
	// 입력받은 숫자를 numbers라는 배열에 저장함
	// 만약 사용자가 음수를 입력하면
	// 사용자가 입력한 정수들을 출력하고 프로그램 종료
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int user = 0;
		int i = 0;
		int[] numbers = new int[0];
		
		while (true)  {
			System.out.print(" 정수를 입력하세요 : ");
			user = scan.nextInt();
//			int[] newnumbers = new int[numbers.length + 1];
			
			if ( user < 0) break;
			
//			for (i = 0; i < numbers.length; i++) {
//				newnumbers[i] = numbers[i];
//			}
			
//			newnumbers[newnumbers.length-1] = user;
//			numbers = newnumbers;
			
			for (i = 0; i < numbers.length; i++) {
				numbers[i] = user;
			}
			
			
			
		}
		
		System.out.println("음수를 입력하여 프로그램이 종료되었습니다" );
		for (int count = 0; count < numbers.length; count ++) {
			
			System.out.println("총 입력한 숫자들은 " + numbers[count] + " 입니다 ");
		}
		
		scan.close();
		
		

	}

}
