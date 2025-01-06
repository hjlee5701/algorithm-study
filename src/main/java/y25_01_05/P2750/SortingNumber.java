package y25_01_05.P2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class SortingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(bf.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = parseInt(bf.readLine());
        }
        int[] sortedArray = insertionSort(array);

        StringBuilder result = new StringBuilder();
        for (int num : sortedArray) {
            result.append(num).append("\n");
        }
        System.out.println(result);
    }


    /**
     * 인접한 두 요소를 비교하며, 가장 큰 값을 끝으로 이동시키며, 끝에서부터 정렬을 완성시켜간다.
     */
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 배열의 앞에서부터 타겟을 설정해, 차례대로 이미 정렬된 배열의 끝에서 부터 비교 하여, 자신의 위치를 찾아 삽입
     */
    public static int[] insertionSort (int[] array) {
        for (int i = 1; i < array.length; i++) {
            int target = array[i];

            int j = i - 1;
            while (j >= 0 && target < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = target;
        }
        return array;
    }



    /**
     * 배열의 정렬되지 않은 곳부터 가장 작은 값만 찾아 앞에서 교환 및 정렬 하며 정렬해나간다.
     */
    public static int[] selectionSort(int[] array){
        int size = array.length;
        for (int target = 0; target < size-1 ; target++) {
            int minIndex = target;

            for (int i = target + 1; i < size; i++) {
                if (array[minIndex] > array[i]) {
                    minIndex = i;
                }
            }
            int temp = array[minIndex];
            array[target] = temp;
            array[minIndex] = array[target];
        }
        return array;
    }
}
