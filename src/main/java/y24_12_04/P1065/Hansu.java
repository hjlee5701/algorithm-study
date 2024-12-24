package y24_12_04.P1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Hansu {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = parseInt(bufferedReader.readLine());
        int hansuCount = findHansuCount(number);

        System.out.println(hansuCount);
    }

    private static int findHansuCount(int number) {
        if (number < 100) {
            return number;
        }
        int count = 99;
        for (int i = 111; i <= number; i++) {
            int first = i/100;
            int second = i%100/10;
            int third = i%10;
            if(first-second == second-third){
                count ++;
            }
        }
        return count;
    }
}
