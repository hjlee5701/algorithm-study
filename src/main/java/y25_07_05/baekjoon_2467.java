package y25_07_05;
// baekjoon 2467 용액
// https://www.acmicpc.net/problem/2467

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class baekjoon_2467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = Arrays
                .stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int leftIdx = 0;
        int rightIdx = n-1;
        // 최소값 보장
        int minimum = Integer.MAX_VALUE;
        int leftResult = nums[0];
        int rightResult = nums[n-1];

        while (leftIdx < rightIdx) {
            // 부분합
            int partSum = nums[leftIdx] + nums[rightIdx];

            // 부분합과 이전 최솟값 비교
            if (minimum > Math.abs(partSum)) {
                leftResult = nums[leftIdx];
                rightResult = nums[rightIdx];
                minimum = Math.abs(partSum);
            }
            // 부분합의 범위 조정
            if (partSum == 0) { // 종료 조건
                break;
            } else if (partSum > 0) {
                rightIdx--;
            } else {
                leftIdx++;
            }
        }
        System.out.println(leftResult + " " + rightResult);
    }
}
/*
1. 리스트 정렬
2. 두 수의 합의 절대값의 최솟값 즉 0에 가까운 값을 찾는다는 점
3. 투포인터는 시간 복잡도가 O(n) 이며 순차적으로 접근이 가능하고, 두 개의 점의 위치를 기록할 수 있다.
 */