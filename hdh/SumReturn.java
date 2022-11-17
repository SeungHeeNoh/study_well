import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
    출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */
public class SumReturn {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        solution(num);
        
    }

    public static int solution(int n) {
        int answer = Stream.of( String.valueOf(n).split("") ).mapToInt(Integer::parseInt).sum();
        System.out.println(answer);
        return answer;
    }
}
