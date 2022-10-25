/*
* ===문제 출처===
* 출처: 프로그래머스 코딩 테스트 연습, "평균 구하기", <https://school.programmers.co.kr/learn/courses/30/lessons/12944?language=java>.
* */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CalcAverage {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] input = br.readLine().split(" ");
			int[] arr = new int[input.length];

			IntStream.range(0, input.length).forEach(i -> arr[i] = Integer.parseInt(input[i]));

			System.out.println(new Solution().solution(arr));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Solution {
	public double solution(int[] arr) {
		return Arrays.stream(arr).average().orElse(0);
	}
}