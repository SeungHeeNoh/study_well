/*
* ===문제 출처===
* 출처: 프로그래머스 코딩 테스트 연습, "배열의 평균값", <https://school.programmers.co.kr/learn/courses/30/lessons/120817>.
* */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayAverage {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int[] numbers = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
			System.out.println(new ArrayAverageSolution().solution(numbers));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class ArrayAverageSolution {
	public double solution(int[] numbers) {
		return Arrays.stream(numbers).mapToDouble(num -> (double)num).average().getAsDouble();
	}
}
