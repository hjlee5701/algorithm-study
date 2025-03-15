package y25_03_02.P11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {
    private static int[] nums;
    private static int N;
    private static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        insertionSort();
        System.out.println(result);
    }
    private static void selectionSort() {
        int waitTime = 0;
        for (int i = 0; i < N; i++) {
            int minIndex = i;
            for (int j = i; j < N; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            waitTime += nums[minIndex];
            nums[minIndex] = nums[i];
            result += waitTime;
        }
    }

    private static void insertionSort() {
        for (int i = 1; i < N; i++) {
            int key = nums[i]; // 현재 삽입할 값 저장

            int j = i - 1;
            while (j >= 0 && key < nums[j]) {
                nums[j + 1] = nums[j]; // 한 칸 이동
                j--;
            }
            nums[j + 1] = key; // 올바른 위치에 key 삽입
        }
    }
}