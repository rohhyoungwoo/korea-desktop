package test;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		//1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기
		
		//1. 입력 클래스
		//2. 변수 선언 int 1개
		//3. 출력 메시지 "금액을 입력하세요 : "
		//4. 입력 메소드 변수 = sc.nextInt();
		//5. 출력 / 5만,1만,5천,천
		
		Scanner sc = new Scanner(System.in);
//		int number = 0;
//		System.out.println("금액을 입력하세요 : ");
//		number = sc.nextInt();
//		System.out.printf("5만원 : %d 1만원 : %d 5천원 : %d 1천원 : %d", number/50000, number/10000, number/5000 ,number/1000);
		
		
		//2. 키와 몸무게를 입력받아 BMI를 계산하기
		// 공식 : 몸무게 / (키 * 키)
		
		//1. 변수 선언 double 2개
		//2. 출력 메시지 "키와 몸무게를 입력하세요 : "
		//3. 입력 메소드 변수 = sc.nextInt();
		//4. 출력 (공식)
		
		double cm = 0, weight = 0;
		System.out.println("키와 몸무게를 입력하세요 : ");
		cm = sc.nextDouble();
		weight = sc.nextDouble();
		System.out.println("BMI : " + weight / (cm * cm));
		
		//3. 밑변과 높이를 입력받아 삼각형의 높이 계산하기
		//공식 : 0.5 * 밑면 * 높이
		
		//1. 변수 선언 double 2개
		//2. 출력 메시지 "삼각형의 밑변과 높이를 입력하세요 : "
		//3. 입력 메소드 변수 = sc.nextDouble();
		//4. 출력 (공식)
		
		double width =
		
		//.1 변수 선언 
		
		//4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력할 것)
		
		//5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 : 15000
		// 총액 : 금액원
		
		//6. 두 자리수 정수를 한 개 입력받아 각 자리의 숫자를 더하기(각 자리수의 합)
		
		//7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
		//true or false
		
		//8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
		//true or false
		
		//9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		//true or false
		
		//10. 연도를 입력받아 윤년인지 아닌지 출력하기(2024년, 2025년도로 확인할 것)
		//true or false => ture이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다로 출력
		// 윤년 계산 : 연도가 4로 나누어 떨어지고 100으로 나누어떨어지지 않거나 400으로 나누어떨어져야한다
		
	}
}
