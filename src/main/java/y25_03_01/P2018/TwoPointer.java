package y25_03_01.P2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoPointer {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int halfIdx = N < 5 ? N : N/2+2;
        int count = 1;
        int startIdx = 1;
        int endIdx = 1;
        int sumNum = 0;

        while (endIdx <= halfIdx) {
            if (sumNum == N) {
                sumNum += endIdx;
                count ++;
                endIdx ++;
            } else if (sumNum > N) {
                sumNum -= startIdx;
                startIdx ++;
            } else {
                sumNum += endIdx;
                endIdx ++;
            }
        }
        System.out.println(count);
    }
}

