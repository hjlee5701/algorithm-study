package y25_01_05.P10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(bf.readLine());
        int result = factorial(N);
        System.out.println(result);
    }

    private static int factorial(int N) {
        if (N == 0) {
            return 1;
        }
        return N * factorial(N-1);
    }
}
