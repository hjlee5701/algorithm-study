package y25_03_03.P2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmazingPrimeNumber {
    private static int N;
    private static final StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] startPrimes = {2, 3, 5, 7};
        for (int prime : startPrimes) {
            dfs(prime, 1);
        }
        System.out.println(result);
    }

    private static void dfs(int number, int length) {
        if (length == N) {
            result.append(number).append("\n");
            return;
        }

        for (int i = 1; i < 10; i += 2) {
            int next = number * 10 + i;
            if (isPrime(next)) {
                dfs(next, length + 1);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
