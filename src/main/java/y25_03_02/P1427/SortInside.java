package y25_03_02.P1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortInside {
    public static int len;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split("");
        len = strArr.length;
        int[] nums = new int[len];

        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(strArr[i]);

        }
        String result = selectSort(nums);
        System.out.println(result);
    }

    private static String selectSort(int[] nums) {
        for (int i = 0; i < len-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < len; j++) {

                if (nums[maxIndex] < nums[j]) {
                    maxIndex = j;
                }
            }
            if (nums[i] < nums[maxIndex]) {
                int temp = nums[i];
                nums[i] = nums[maxIndex];
                nums[maxIndex] = temp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int n : nums) {
            sb.append(n);
        }
        return sb.toString();
    }
}
