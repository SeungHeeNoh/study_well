/*
* ===문제 출처===
* 출처: 프로그래머스 코딩 테스트 연습, "배열의 유사도", <https://school.programmers.co.kr/learn/courses/30/lessons/120903>.
* */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimilarityofArray {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] input1 = br.readLine().split(",");
			String[] input2 = br.readLine().split(",");
			
			System.out.println(new SimilarityofArraySolution().solution(input1, input2));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class SimilarityofArraySolution {
	public int solution(String[] s1, String[] s2) {
		Set<String> union = Stream.concat(Stream.of(s1), Stream.of(s2)).collect(Collectors.toSet());

		return s1.length + s2.length - union.size();
	}
}