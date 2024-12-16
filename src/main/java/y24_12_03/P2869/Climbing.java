package y24_12_03.P2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

public class Climbing {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = bufferedReader.readLine().split("\\s");
        int climb = parseInt(numbers[0]);
        int slip = parseInt(numbers[1]);
        int height = parseInt(numbers[2]);
        int todayClimb = climb - slip;

        // ( 마지막 날 -1 ) / ( 하루 이동 거리 ) + 1
        // -1, +1 를 통해 정수 나눗셈의 버림 계산을 방지하기 한다.
        int days = (height - slip - 1) / todayClimb + 1;
        System.out.println(days);
    }
}
