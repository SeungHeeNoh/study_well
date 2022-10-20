package studyWell1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P1_seqOpen2 {

	/*
	 * 프로그램 명: seq(open)
		제한시간: 1 초
		두 자연수가 주어진다. 두 수 사이의 수(두 수 포함)를 차례대로 출력하는 프로그램을 작성하시오.
		
		입력
		두 수가 입력으로 주어진다. 두 수는 100 이하의 자연수이다.
		출력
		두 수 사이에 공백을 하나 준다.
		
		입출력 예
		입력
		3 6
		출력
		3 4 5 6
		
		입력
		6 3
		출력
		3 4 5 6
	 */
	public static void main(String[] args) {
		try ( Scanner sc = new Scanner(System.in) ) {
		    int input1 = sc.nextInt();
		    int input2 = sc.nextInt();

		    int bigNum   = input1>=input2 ? input1 : input2;
		    int smallNum = input1<input2  ? input1 : input2;

		    IntStream is = IntStream.rangeClosed(smallNum, bigNum);
		    String result = is.collect(StringBuilder::new, (sb,i) -> sb.append(i+" "), StringBuilder::append).toString();
		    System.out.println(result.substring(0, result.length()-1));
		}
	}

}
