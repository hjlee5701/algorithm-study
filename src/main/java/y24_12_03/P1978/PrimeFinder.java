package y24_12_03.P1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class PrimeFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(br.readLine());
        String[] numbers = br.readLine().split("\\s");
        int primeCount = 0;
        for (int j=0; j < N; j++) {
            primeCount += findPrime(parseInt(numbers[j]));
        }
        System.out.println(primeCount);
    }

    private static int findPrime(int num) {
        if(num == 1){
            return 0;
        }
        int squareRoot = (int)Math.sqrt(num);
        for(int i=2; i <= squareRoot; i++){
            if (num % i == 0){
                System.out.println(i);
                return 0;
            }
        }
        return 1;
    }
}
