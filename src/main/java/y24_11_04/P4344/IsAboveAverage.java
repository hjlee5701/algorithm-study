package y24_11_04.P4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsAboveAverage {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < caseCount; i++) {
            String[] nums = br.readLine().split(" ");
            getAbovePercentage(nums);
        }
    }

    private static void getAbovePercentage(String[] nums) {
        int count = Integer.parseInt(nums[0]);
        int sum = 0;
        int aboveCount = 0;

        for (int i = 1; i <= count; i++) {
            int score = Integer.parseInt(nums[i]);
            sum += score;
        }

        double average = (double) sum / count;

        for (int i = 1; i <= count; i++) {
            int score = Integer.parseInt(nums[i]);
            if (score > average) {
                aboveCount++;
            }
        }

        double percentage = (double) aboveCount / count * 100;
        System.out.printf("%.3f%%\n", percentage);
    }
}
