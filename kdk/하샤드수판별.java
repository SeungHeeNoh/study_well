package kdk;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
 * 
 * 하샤드 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 * 
 * 문제 설명
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 * 
 * 제한 조건
 * x는 1 이상, 10000 이하인 정수입니다.
 * 
 */
public class 하샤드수판별 {

    public boolean solution(int x) {

        boolean answer = true;

        //step1. int 숫자값을 int[] 로 전환
        int[] arr = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();

        //step2. 배열의 모든 요소를 합
        int sum = Arrays.stream(arr).sum();

        //step3. 입력값 x 를 자릿수의 합인 sum 으로 나누어 나머지가 없으면 하샤드의 수로 판정
        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}