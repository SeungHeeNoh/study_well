/*
 * ===문제 출처===
 * seq, <http://220.89.64.243/30stair/seq/seq.php?pname=seq>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());

// 			System.out.println(new Seq(parseInt(st.nextToken()), parseInt(st.nextToken())).printBetween());
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
// 	}
// }

class Seq {
	int a, b;

	public Seq() {}

	public Seq(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public String printBetween() {
		StringBuilder sb = new StringBuilder();
		int s = Math.min(a, b),
			e = Math.max(a, b);

		IntStream.rangeClosed(s, e).forEach(number -> sb.append(number).append(" "));

		return sb.toString();
	}
}