package kdk;

import java.util.Arrays;
import java.util.List;

/**
 * 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
 * 
 * 배열의 유사도
 * https://school.programmers.co.kr/learn/courses/30/lessons/120903
 *
 */
public class 배열의유사도 {

    public static int solution(String[] s1, String[] s2) {

        List<String> l1 = Arrays.asList(s1);
        List<String> l2 = Arrays.asList(s2);

        return (int)l1.stream().filter(l2::contains).distinct().count();
    }
}