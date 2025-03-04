package y25_03_01.P1253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GoodNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        int count = 0;
        for (int k = 0; k < N; k++) {
            
            int start = 0;
            int end = N - 1;
            int mayGood = nums[k];

            while (start < end) {
                if (nums[start] + nums[end] == mayGood) {
                    if (start != k && end != k) {
                        count ++;
                        break;
                    } else if (start == k) {
                        start++;
                    } else {
                        end--;
                    }

                } else if (nums[start] + nums[end] < mayGood) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}