package y25_01_01.P1914;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HanoiTower {
    static StringBuilder resultBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int diskCount = Integer.parseInt(bf.readLine());
        String moveCount = BigInteger.ONE.shiftLeft(diskCount).subtract(BigInteger.ONE).toString(10); // 이동 횟수: 2^N - 1
        System.out.println(moveCount);

        if (diskCount <= 20) {
            hanoi(diskCount, 1, 3, 2);
            System.out.println(resultBuilder);
        }
    }

    public static void hanoi(int diskCount, int from, int to, int other) {
        if (diskCount == 0) {
            return;
        }
        hanoi(diskCount - 1, from, other, to);
        resultBuilder.append(from).append(" ").append(to).append("\n");
        hanoi(diskCount - 1, other, to, from);
    }
}
