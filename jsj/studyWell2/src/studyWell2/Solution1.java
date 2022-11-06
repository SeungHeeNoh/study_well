package studyWell2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/*
 * 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/courses/30/lessons/12932
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */
public class Solution1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int input = sc.nextInt();
			int[] answer = solution(input);

			Arrays.stream(answer).forEach(System.out::print);
		}
	}

	public static int[] solution(long n) {

		//문자열 리버스
        String str = new StringBuffer(String.valueOf(n)).reverse().toString();
        //int 배열로
        return Stream.of(str.split(""))
        				.mapToInt(Integer::valueOf)
        				.toArray();
        
    }
}
