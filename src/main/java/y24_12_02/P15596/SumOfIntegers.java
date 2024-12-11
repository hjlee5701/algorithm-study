package y24_12_02.P15596;

public class SumOfIntegers {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sum(a));
    }

    private static long sum(int[] a) {
        long result = 0L;
        for (int n : a) {
            result += n;
        }
        return result;
    }
}
