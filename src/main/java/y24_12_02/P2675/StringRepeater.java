package y24_12_02.P2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringRepeater {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder;
        int T = Integer.parseInt(br.readLine());
        while (T > 0) {
            builder = new StringBuilder();
            T--;
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());

            int repeatCount = Integer.parseInt(tokenizer.nextToken());

            for (String str : tokenizer.nextToken().split("")) {
                builder.append(str.repeat(repeatCount));
            }
            System.out.println(builder);
        }
    }
}
