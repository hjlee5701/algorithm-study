package y24_12_02.P2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Filip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");

        int firstNum = Integer.parseInt(new StringBuilder(numbers[0]).reverse().toString());
        int secondNum = Integer.parseInt(new StringBuilder(numbers[1]).reverse().toString());

        System.out.println(Math.max(firstNum, secondNum));
    }
}
