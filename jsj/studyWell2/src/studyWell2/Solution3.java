package studyWell2;

import java.util.Scanner;
import java.util.stream.Stream;

public class Solution3 {

	/*
	 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/12947
	 *  햐사드 수: 10, 12, 18, 20, 21, 24, 27, 30, 36, 40, 42, 45, 48, 50, 54, 60, 63, 70, 72, 80, 81, 84, 90, 100, 102, 108, 110, 111, 112, 114, 117, 120, 126, 132, 133, 135, 140, 144, 150, 152, 153, 156, 162, 171, 180, 190, 192, 195, 198, 200
	 *  문제 설명
		양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
		예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
		자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
		
		제한 조건
		x는 1 이상, 10000 이하인
	 */
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			System.out.println(solution(n));
		}
		
	}

	public static boolean solution(int x) {

		return x % ( Stream.of(String.valueOf(x).split(""))
					 .mapToInt(Integer::valueOf)
					 .reduce(0, Integer::sum) )  == 0;
		
	}
}
