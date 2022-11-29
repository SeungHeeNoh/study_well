package studyWell2;

import java.util.function.Predicate;
import java.util.stream.Stream;


/*
 * 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */
public class Solution5 {

	public static void main(String[] args) {
		String[] arr1 = {"a", "b", "c"};
		String[] arr2 = {"com", "b", "d", "p", "c"};
		System.out.println(solution(arr1, arr2));
	}
	
    public static int solution(String[] s1, String[] s2) {
        return (int) Stream.of(s1).filter(str -> Stream.of(s2).anyMatch(Predicate.isEqual(str))).count();
    }
}

