package y24_12_01.P2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long number = 1;

        for (int i = 0; i < 3; i++) {
            number *= Integer.parseInt(br.readLine());
        }

        String numberStr = String.valueOf(number);
        int[] numberCount = new int[10];

        for (char c : numberStr.toCharArray()) {
            numberCount[c - '0']++;
        }
        for (int count : numberCount) {
            System.out.println(count);
        }
    }

}
