import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;
/**
    출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/courses/30/lessons/120813
    짝수는 싫어요
 */
public class HateEven {
    public static void main(String[] args) throws IOException {
        // 프로그래머스 통해서 soulution method 실행완료
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Arrays.toString( solution(Integer.parseInt(br.readLine())) ));

    }

    public static int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(num -> num % 2 != 0).toArray();
    }
}
