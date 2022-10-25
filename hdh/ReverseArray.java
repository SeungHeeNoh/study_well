import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

/**
    출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
public class ReverseArray {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer(br.readLine());
        System.out.println( Arrays.toString(solution(sb.reverse().toString())) ); 

    }

    public static int[] solution(String param) {
        int[] answer = Stream.of(param.split("")).mapToInt(Integer::parseInt).toArray();
        return answer;
    }
}
