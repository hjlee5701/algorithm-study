package y25_03_01.P17298;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class NGE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int[] result = new int[N];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int k = 1; k < N; k++) {
            while (!stack.empty() && nums[stack.peek()] < nums[k]) {
                result[stack.pop()] = nums[k];
            }
            stack.push(k);
        }
        while (!stack.empty()) {
            result[stack.pop()] = -1;
        }
        String strResult = Arrays.stream(result)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(strResult);
    }
}
