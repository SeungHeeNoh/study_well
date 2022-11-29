/*
* ===문제 출처===
* 출처: 프로그래머스 코딩 테스트 연습, "짝수 홀수 개수", <https://school.programmers.co.kr/learn/courses/30/lessons/120824>.
* */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OddEvenCount {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int[] arr = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

			System.out.println(Arrays.toString(new OddEvenCountSolution().solution(arr)));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class OddEvenCountSolution {
    public int[] solution(int[] num_list) {
        int[] result = new int[2];
        
        result[0] = (int) Arrays.stream(num_list).filter(i -> i%2 == 0).count();
        result[1] = num_list.length - result[0];
        return result;
    }
}