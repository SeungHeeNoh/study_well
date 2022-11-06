import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
    출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/courses/30/lessons/12944
 */
public class ArrayAvg {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( solution(br.readLine()) );
        
    }

    public static double solution(String param) {

        IntStream is = Stream.of(param.split(" ")).mapToInt(Integer::parseInt);
        return is.average().orElse(0);

    }
}