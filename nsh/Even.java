/*
* ===문제 출처===
* 출처: 프로그래머스 코딩 테스트 연습, "짝수의 합", <https://school.programmers.co.kr/learn/courses/30/lessons/120831>.
* */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Even {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println(new EvenSolution().solution(Integer.parseInt(br.readLine())));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class EvenSolution {
    public int solution(int n) {
        return (int)IntStream.rangeClosed(1, n).filter(i -> i%2 == 0).sum();
    }
}