package studyWell2;

import java.util.stream.IntStream;

/*
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 * https://school.programmers.co.kr/learn/courses/30/lessons/120817
 */
public class Solution9 {

    public static void main(String[] args) {
        try {
            int[] numbers = {};
            System.out.println(solution(numbers));
        } catch (NoSuchElementException e) {
            System.out.println("[FAIL] get the average of a array");
        }
    }

    public static double solution(int[] numbers) throws NoSuchElementException {
        return Arrays.stream(numbers).average().getAsDouble();
    }
}
