/*
* ===문제 출처===
* 출처: 프로그래머스 코딩 테스트 연습, "짝수는 싫어요", <https://school.programmers.co.kr/learn/courses/30/lessons/120813>.
* */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class HateEven {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int input = Integer.parseInt(br.readLine());

			System.out.println(Arrays.toString(new HateEvenSolution().solution(input)));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class HateEvenSolution {
	public int[] solution(int n) {
		return IntStream.rangeClosed(1, n).filter(num -> num%2 != 0).toArray();
	}
}
