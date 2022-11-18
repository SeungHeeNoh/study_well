package kdk;

import java.util.stream.IntStream;

/**
 * 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
 * 
 * 짝수 홀수 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120831
 *
 */
public class 짝수의합 {

    public int solution(int n) {

        return (int)IntStream.rangeClosed(0, n).filter(s -> s % 2 == 0).sum();
    }
}