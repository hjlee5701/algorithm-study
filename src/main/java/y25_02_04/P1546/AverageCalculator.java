package y25_02_04.P1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] scores = br.readLine().split(" ");

        int maximum = 0;
        double sumScore = 0;

        for (String score : scores) {
            int scoreNum = Integer.parseInt(score);
            maximum = Math.max(scoreNum, maximum);
            sumScore += scoreNum;
        }

        System.out.println(sumScore/N/maximum*100);
    }
}
