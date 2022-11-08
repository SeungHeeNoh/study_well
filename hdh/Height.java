import java.util.Arrays;
/**
    출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/courses/30/lessons/120585
 */
public class Height {
    public static void main(String[] args) {
        // 프로그래머스 통해서 soulution method 실행완료
        // 호출을 위한 임의 array
        int[] array = {149, 180, 192, 170};
        int height = 167;
        System.out.println(solution(array, height));
    }

    public static int solution(int[] array, int height) {
        int answer = 0;
        answer = Arrays.stream(array)
                    .filter(item -> item > height)
                    .toArray().length;
        return answer;
    }
}
