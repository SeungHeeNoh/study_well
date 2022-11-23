package kdk;

import java.util.Arrays;

/**
 * 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
 * 
 * 배열의평균값
 * https://school.programmers.co.kr/learn/courses/30/lessons/120817
 
 */
public class 배열의평균값 {

    public double solution(int[] numbers) {

        return (double)Arrays.stream(numbers).average().orElse(0);
    }
}