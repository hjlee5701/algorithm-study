package y25_03_03.P10989;

import java.io.*;


public class SortingNumber3 {
    private static int N;
    private static int[] nums;
    private static int maximum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        maximum = 0;
        nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            maximum = Math.max(maximum, nums[i]);

        }
        radixSort();
        for (int i = 0; i < N; i++) {
            bw.write(nums[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void radixSort() {
        int digit = 1;
        // 각 자리수(digit place)별로 정렬
        while (maximum/digit > 0) {
            countingSort(digit);
            digit *= 10;
        }
    }

    private static void countingSort(int digit) {
        int[] output = new int[N];
        int[] count = new int[10];

        // 각 자릿수별 count
        for (int i = 0; i < N; i++) {
            count[(nums[i] / digit) % 10]++;
        }

        // 누적 합
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // output 배열에 정렬
        for (int i = N - 1; i >= 0; i--) {
            output[count[(nums[i] / digit) % 10] - 1] = nums[i];
            count[(nums[i] / digit) % 10]--;
        }

        // 정렬 결과 원본 배열로 복사
        if (N >= 0) System.arraycopy(output, 0, nums, 0, N);
    }
}
