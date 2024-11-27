package y24_11_04.P10952;

import java.util.Scanner;

public class PrintPlusCalculate {
    public static void main(String[] args){
        printPlusCalculate();
    }


    public static void printPlusCalculate() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String[] nums = scanner.nextLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            if(a+b == 0){
                break;
            }
            System.out.println(a+b);
        }
    }
}

