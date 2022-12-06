package studyWell2;
import java.util.stream.IntStream;

/*
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 * https://school.programmers.co.kr/learn/courses/30/lessons/120813
 */
public class Solution10 {
    public static void main(String[] args) {
        solution(100);
    }
    
    public static int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(v -> v%2!=0).sorted().toArray();
    }

}
