import java.util.Arrays;
import java.util.function.Predicate;
/**
    출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */
public class ArrayDupCnt {
    public static void main(String[] args) {
        // 프로그래머스 통해서 soulution method 실행완료
        // 호출을 위한 임의 array
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(solution(s1, s2));
    }

    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        answer = Arrays.stream(s1)
                    .filter(item -> Arrays.stream(s2).anyMatch(Predicate.isEqual(item)))
                    .toArray().length;
        return answer;
    }
}
