/*
* ===문제 출처===
* 출처: 프로그래머스 코딩 테스트 연습, "하샤드 수", <https://school.programmers.co.kr/learn/courses/30/lessons/12947>.
* */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HarshadNumber {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println(new HarshadNumberSolution().solution(Integer.parseInt(br.readLine())));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class HarshadNumberSolution {
	public boolean solution(int x) {
		String[] input = String.valueOf(x).split("");
		int sum = Arrays.stream(input).mapToInt(Integer::parseInt).sum();

		return x % sum == 0;
	}
}