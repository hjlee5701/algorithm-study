package y25_03_02.P1377;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        SortedArray[] A = new SortedArray[N];

        for (int i = 0; i < N; i++) {
            A[i] = new SortedArray(i, Integer.parseInt(br.readLine()));
        }
        Arrays.sort(A);
        // 가장 많이 이동한 값 = 마지막으로 정렬된 값
        // 정렬 전 index - 정렬 후 index + 1 (+초기값) = 결과

        int maxMoveIndex = 0;
        for (int i = 0; i < N; i++) {
            if (maxMoveIndex < A[i].index - i) {
                maxMoveIndex = A[i].index - i;
            };
        }
        System.out.println(maxMoveIndex + 1);
    }
}


class SortedArray implements Comparable<SortedArray> {
    int index;
    int element;
    SortedArray(int index, int element) {
        this.index = index;
        this.element = element;

    }

    @Override
    public int compareTo(SortedArray o) {
        return this.element - o.element;
    }
}