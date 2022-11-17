import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
    출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */
public class Harshad {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println("Harshad : " + solution(num));
        
    }

    public static boolean solution(int x) {
        int sum = Stream.of( String.valueOf(x).split("") ).mapToInt(Integer::parseInt).sum();
        boolean answer = (x % sum) == 0;
        return answer;
    }
}
