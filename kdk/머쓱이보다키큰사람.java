package kdk;

import java.util.Arrays;

/**
 * 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
 * 
 * 머쓱이보다 키 큰 사람
 * https://school.programmers.co.kr/learn/courses/30/lessons/120585
 
 */
public class 머쓱이보다키큰사람 {

    public int solution(int[] array, int height) {

        return (int)Arrays.stream(array).boxed().filter(s -> s > height).count();
    }
}