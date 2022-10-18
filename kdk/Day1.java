package kdk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 * Day1
 */
public class Day1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        str = br.readLine();

        String[] input = str.split(" ");
        Integer start = Integer.parseInt(input[0]);
        Integer end = Integer.parseInt(input[1]);

        IntStream.rangeClosed(start, end).forEach(t -> System.out.print(t + " "));
    }
}