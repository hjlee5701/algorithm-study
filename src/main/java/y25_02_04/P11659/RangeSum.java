package y25_02_04.P11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RangeSum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer NM = new StringTokenizer(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());

        int[] S = new int[N+1];
        for (int i = 1; i <= N; i++) {
            S[i] += S[i-1] + Integer.parseInt(st.nextToken());
        }
        while (M-- > 0) {
            StringTokenizer range = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(range.nextToken());
            int j = Integer.parseInt(range.nextToken());

            System.out.println(S[j]-S[i-1]);
        }
    }
}
