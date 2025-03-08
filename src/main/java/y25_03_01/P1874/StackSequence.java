package y25_03_01.P1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numLength = Integer.parseInt(st.nextToken());
        int[] nums = new int[numLength+1];

        for (int i = 1; i <= numLength; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        int idx = 1;

        for (int k = 1; k <= numLength; k++) {
            stack.push(k);
            result.append("+\n");

            while (!stack.empty() && stack.peek() == nums[idx]) {
                stack.pop();
                idx ++;
                result.append("-\n");
            }
        }
        if (stack.empty()) {
            System.out.println(result);
        } else {
            System.out.println("NO");
        }
    }
}
