import java.util.Arrays;
/**
    출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/courses/30/lessons/120824
 */
public class EvenOddCnt {
    public static void main(String[] args) {
        // 프로그래머스 통해서 soulution method 실행완료
        // 호출을 위한 임의 array
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        answer[0] = (int) Arrays.stream(num_list).filter(num -> num % 2 == 0).count();
        answer[1] = num_list.length - answer[0];
        return answer;
    }
}
