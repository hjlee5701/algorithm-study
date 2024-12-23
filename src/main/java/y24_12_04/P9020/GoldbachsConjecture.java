package y24_12_04.P9020;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldbachsConjecture {
    public static boolean[] notPrime = new boolean[10000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        sieveOfEratosthenes();

        while (testCase-- > 0) {
            int number = Integer.parseInt(br.readLine());
            int leftPrime = number/2;
            int rightPrime = number/2;
            while(true){
                // 두 소수의 차가 최소값이어야 하므로 number/2 부터 시작
                // 소수의 합이 number 이어야 하므로, left++, right-- 유지
                if( !notPrime[leftPrime] && !notPrime[rightPrime]){
                    System.out.println(leftPrime + " " + rightPrime);
                    break;
                }
                leftPrime --;
                rightPrime ++;
            }
        }
    }

    /**
     * 에라토스테네스의 체
     * 소수를 판별할 범위만큼 배열을 할당 및 초기화 (Default 값)
     * 2부터 특정 수의 배수의 해당하는 수를 지워나간다.
     * 이때 자기 자신을 제외한 배수를 처리한다.
         *  2*2 ~ 2* arrayLength
         *  3*3
         *  4*4 ----> 4*2, 4*3 은 앞에서 처리함
     */
    private static void sieveOfEratosthenes() {
        notPrime[0]= notPrime[1]=true;
        for(int i = 2; i <= Math.sqrt(notPrime.length); i++){
            if(notPrime[i])
                continue;

            for(int j = i*i; j< notPrime.length; j+=i ){
                notPrime[j]=true;
            }
        }
    }
    // https://velog.io/@max9106/Algorithm-%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98-%EC%B2%B4

//    private static int findPartitionMinPrime(int number) {
//
//        int minimumDiff = number;
//        int minimizePrime = number;
//        int tempDiff = 0;
//
//        for (int i = 2; i <= number/2; i++) {
//            if(i == (number-i) && isPrime(i)) {
//                return i;
//            }
//            if (isPrime(i) && isPrime(number-i)) {
//                tempDiff = number - i * 2;
//                if(tempDiff < minimumDiff) {
//                    minimizePrime = i;
//                    minimumDiff = tempDiff;
//                }
//            }
//        }
//        return minimizePrime;
//    }
//
//    private static boolean isPrime(int num) {
//        int squareRoot = (int)Math.sqrt(num);
//        for (int j = 2; j <= squareRoot; j++) {
//            if(num % j == 0){
//                return false;
//            }
//        }
//        return true;
//    }
}
