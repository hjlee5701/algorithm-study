package y25_03_01.P10986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RemainderRangeSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long count = 0;
        long[] S = new long[N+1];
        long[] C = new long[M];
        StringTokenizer nums = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {

            S[i] = S[i - 1] + Integer.parseInt(nums.nextToken());

            long remainder = S[i] % M;

            if (remainder == 0) {
                count ++;
            }
            C[(int)remainder] ++;
        }

        for (int j = 0; j < M; j++) {
            if (C[j] > 1) {
                count += (C[j] * (C[j] - 1) /2);
            }
        }
        System.out.println(count);
    }
}
// 5 3
// 1 2 3 1 2