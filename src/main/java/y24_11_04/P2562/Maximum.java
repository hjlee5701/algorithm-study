package y24_11_04.P2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maximum {

    public static void main(String[] args) throws IOException {
        getMaximum();

    }

    private static void getMaximum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        int maximum = 0;
        for (int i = 1; i <= 9; i++) {
            int number = Integer.parseInt(br.readLine());
            if (maximum < number) {
                count = i;
                maximum = number;
            }

        }
        System.out.println(maximum);
        System.out.println(count);
    }
}
