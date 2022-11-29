/*
* ===문제 출처===
* 출처: 프로그래머스 코딩 테스트 연습, "머쓱이보다 키 큰 사람", <https://school.programmers.co.kr/learn/courses/30/lessons/120585>.
* */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TallerThan {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int[] input = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
            int height = Integer.parseInt(br.readLine());

			System.out.println(new TallerThanSolution().solution(input, height));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class TallerThanSolution {
	public int solution(int[] array, int height) {
		return (int)Arrays.stream(array).filter(i -> i > height).count();
	}
}