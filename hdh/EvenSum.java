import java.util.stream.IntStream;

/**
    출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/courses/30/lessons/120831
 */
public class EvenSum {
    public static void main(String[] args) {
        // 프로그래머스 통해서 soulution method 실행완료
        System.out.println(solution(10));
        System.out.println(solution(4));
    }

    public static int solution(int n) {
        int answer = 0;
        answer = IntStream.rangeClosed(1, n).filter(num -> (num % 2) == 0).sum();
        return answer;
    }
}
