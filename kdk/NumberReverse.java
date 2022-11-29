package kdk;

import java.util.stream.Stream;

/**
 * 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
 * 
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 * 
 * 
 */
public class NumberReverse {

    public int[] solution(long input) {

        String sInput = String.valueOf(input);
        StringBuffer sb = new StringBuffer(sInput);

        String rInput = sb.reverse().toString();

        return Stream.of(String.valueOf(rInput).split("")).mapToInt(Integer::parseInt).toArray();
    }
}