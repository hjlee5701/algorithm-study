package y25_03_03.P11004;

import java.io.*;
import java.util.StringTokenizer;

public class KthSort {
    private static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        nums = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(0, N-1);

        bw.write(String.valueOf(nums[K-1]));
        bw.flush();
        br.close();
        bw.close();
    }

    private static void quickSort(int startIdx, int endIdx) {

        int pivot = nums[(startIdx+endIdx) / 2];
        int pivotLeft = startIdx;
        int pivotRight = endIdx;

        while (pivotLeft <= pivotRight) {
            while (nums[pivotLeft] < pivot) pivotLeft++;
            while (nums[pivotRight] > pivot) pivotRight--;

            if (pivotLeft <= pivotRight) {
                swap(pivotLeft++, pivotRight--); // 교환 후, 다음 index 탐색을 위해 ++.--
            }
        }

        // left와 right 의 대소관계가 유지될 시에만 퀵 정렬 함수 재귀호출
        if (startIdx < pivotRight) quickSort(startIdx, pivotRight);
        if (pivotLeft < endIdx) quickSort(pivotLeft, endIdx);
    }

    private static void swap(int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
