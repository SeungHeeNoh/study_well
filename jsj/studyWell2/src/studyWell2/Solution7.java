package studyWell2;

import java.util.Arrays;

/*
 * 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 * https://school.programmers.co.kr/learn/courses/30/lessons/120824
 */
public class Solution7 {

	public static void main(String[] args) {
		int[] arr = {149, 180, 192, 170};
		System.out.println(solution(arr));
	}

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        answer[0] = (int) Arrays.stream(num_list).filter(n -> n%2==0).count();
        answer[1] = num_list.length - answer[0];
        return answer;
    }
}

