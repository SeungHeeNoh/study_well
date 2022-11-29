import java.util.Arrays;
/**
    출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/courses/30/lessons/120817
    배열의 평균값
 */
public class NumbersArrAvg {
    public static void main(String[] args) {
        // 프로그래머스 통해서 soulution method 실행완료
        // 호출을 위한 임의 array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        
        System.out.println(solution(numbers));
        System.out.println(solution(numbers2));
    }

    public static double solution(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }
}
