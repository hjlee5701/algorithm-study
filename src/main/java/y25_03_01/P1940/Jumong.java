package y25_03_01.P1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Jumong {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());

        int[] num = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        int count = 0;
        int start = 0;
        int end = N-1;
        while (start < end) {
            if (num[start] + num[end] == M) {
                count ++;
                start ++;
                end --;
            } else if (num[start] + num[end] < M) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(count);
    }
}