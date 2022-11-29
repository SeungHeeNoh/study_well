package studyWell2;

import java.util.stream.Stream;

/*
 * 출처: https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */
public class Solution4 {

	public static void main(String[] args) {
		System.out.println(solution(123));
	}
	
    public static int solution(int n) {
        return Stream.of(String.valueOf(n).split(""))
        		     .mapToInt(Integer::valueOf)
        		     .reduce(0, Integer::sum);
    }
}

