package studyWell2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/*
 * 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/courses/30/lessons/12944?language=java
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 */
public class Solution2 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);) {
			String arrStr = sc.next();
			int[] arr = Stream.of(arrStr.split(""))
					.filter(str->str.matches("-?\\d+"))
					.mapToInt(Integer::valueOf)
					.toArray();
			double answer = solution(arr);
			System.out.println(answer);
		}
	}

	public static double solution(int[] arr) {
		return Arrays.stream(arr).average().getAsDouble();
    }
}
