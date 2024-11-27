package y24_11_04.P2480;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeDice {
    public static void main(String[] args) throws IOException {
        System.out.println(getPriceByDice());
    }

    private static int getPriceByDice() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");

        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int c = Integer.parseInt(nums[2]);

        if (a == b && a == c)
            return 10000 + a * 1000;
        else if (a == b || a == c)
            return 1000 + a * 100;
        else if (b == c)
            return 1000 + b * 100;

        int maximum = a;
        if (maximum < b)
            maximum = b;
        if (maximum < c)
            maximum = c;
        return maximum * 100;
    }
}
