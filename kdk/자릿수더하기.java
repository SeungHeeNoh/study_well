package kdk;

import java.util.stream.Stream;

/**
 * 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
 * 
 * 자릿수 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12931
 * 
 * 문제 설명
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 * 
 * 제한 조건
 * N의 범위 : 100,000,000 이하의 자연수
 * 
 */
public class 자릿수더하기 {

    public int solution(int n) {

        //step1. int 숫자값을 int[] 로 전환
        return Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}