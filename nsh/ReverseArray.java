/*
 * ===문제 출처===
 * 출처: 프로그래머스 코딩 테스트 연습, "자연수 뒤집어 배열로 만들기", <https://school.programmers.co.kr/learn/courses/30/lessons/12932?language=java>.
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(Arrays.toString(new Solution().solution(Long.parseLong(br.readLine()))));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class Solution {
    public int[] solution(long n) {
        String[] inputArray = String.valueOf(n).split("");
        int[] answer = new int[inputArray.length];

        IntStream.range(0, inputArray.length).forEach(i -> answer[inputArray.length-i-1] = Integer.parseInt(inputArray[i]));

        return answer;
    }
}