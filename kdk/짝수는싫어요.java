package kdk;

import java.util.stream.IntStream;

/**
 * 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
 * 
 * 짝수는 싫어요
 * https://school.programmers.co.kr/learn/courses/30/lessons/120813
 
 */
public class 짝수는싫어요 {

    public int[] solution(int n) {

        return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 1).toArray();

    }
}