package y25_03_03.P11650;

import java.io.*;
import java.util.StringTokenizer;

public class CoordinateSort {
    private static int[][] coordinates;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        coordinates = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordinates[i][0] = Integer.parseInt(st.nextToken());
            coordinates[i][1] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, N-1);

        StringBuilder result = new StringBuilder();

        for (int j = 0; j < N; j++) {
            result.append(coordinates[j][0]).append(" ").append(coordinates[j][1]).append("\n");
        }

        bw.write(result.toString());
        bw.flush();
        bw.close();

    }

    private static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // 배열을 두 부분으로 나누어 정렬
            mergeSort(left, mid);
            mergeSort(mid + 1, right);

            // 정렬된 배열 병합
            merge(left, mid, right);
        }
    }
    private static void merge(int left, int mid, int right) {
        int leftArrSize = mid - left + 1;
        int rightArrSize = right - mid;

        int[][] leftArr = new int[leftArrSize][2];
        int[][] rightArr = new int[rightArrSize][2];

        // 임시 배열에 데이터 복사
        System.arraycopy(coordinates, left, leftArr, 0, leftArrSize);
        System.arraycopy(coordinates, mid + 1, rightArr, 0, rightArrSize);

        int leftArrIdx = 0, rightArrIdx = 0, k = left;

        // 두 배열 병합
        while (leftArrIdx < leftArrSize && rightArrIdx < rightArrSize) {

            if (leftArr[leftArrIdx][0] < rightArr[rightArrIdx][0]) {
                coordinates[k++] = leftArr[leftArrIdx++];

            } else if (leftArr[leftArrIdx][0] > rightArr[rightArrIdx][0]) {
                coordinates[k++] = rightArr[rightArrIdx++];

            } else {
                if (leftArr[leftArrIdx][1] <= rightArr[rightArrIdx][1]){
                    coordinates[k++] = leftArr[leftArrIdx++];
                } else {
                    coordinates[k++] = rightArr[rightArrIdx++];
                }
            }

        }

        // 남은 한 쪽 배열의 요소들 추가
        while (leftArrIdx < leftArrSize) coordinates[k++] = leftArr[leftArrIdx++];
        while (rightArrIdx < rightArrSize) coordinates[k++] = rightArr[rightArrIdx++];
    }

}
