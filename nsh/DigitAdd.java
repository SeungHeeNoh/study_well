/*
* ===문제 출처===
* 출처: 프로그래머스 코딩 테스트 연습, "자릿수 더하기", <https://school.programmers.co.kr/learn/courses/30/lessons/12931>.
* */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DigitAdd {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println(new DigitAddSolution().solution(Integer.parseInt(br.readLine())));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class DigitAddSolution {
	public int solution(int x) {
		String[] input = String.valueOf(x).split("");
		return Arrays.stream(input).mapToInt(Integer::parseInt).sum();
	}
}