package y24_11_04.P2839;

import java.util.Scanner;

public class SugarDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(calculate(n));

    }
    private static int calculate(int n) {
        int result = 0;
        while (n >= 0) {
            if (n % 5 == 0) {
                result += n / 5;
                return result;
            }
            n -= 3;
            result++;
        }
        return -1;
    }
}
