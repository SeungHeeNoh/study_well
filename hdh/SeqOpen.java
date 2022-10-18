import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
/*
프로그램 명: seq(open)
제한시간: 1 초
두 자연수가 주어진다. 두 수 사이의 수(두 수 포함)를 차례대로 출력하는 프로그램을 작성하시오.

입력
두 수가 입력으로 주어진다. 두 수는 100 이하의 자연수이다.
출력
두 수 사이에 공백을 하나 준다.

입출력 예
입력 : 3 6
출력 : 3 4 5 6

입력 : 6 3
출력 : 3 4 5 6
 */
public class SeqOpen {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        solution(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

    }

    public static void solution(int num1, int num2) {
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        IntStream.rangeClosed(min, max).forEach(num -> System.out.print(Integer.toString(num).concat(" ")));
    }
}
