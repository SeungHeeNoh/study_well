package kdk;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
 * 
 * 짝수 홀수 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120824
 
 */
public class 짝수홀수개수 {

    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        answer[0] = (int)Arrays.stream(num_list).boxed().collect(Collectors.toList()).stream().filter(s -> s % 2 == 0).count();
        answer[1] = (int)Arrays.stream(num_list).boxed().collect(Collectors.toList()).stream().filter(s -> s % 2 != 0).count();

        return answer;
    }
}