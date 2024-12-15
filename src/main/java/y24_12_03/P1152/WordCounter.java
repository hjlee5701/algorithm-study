package y24_12_03.P1152;

import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int prevByte = 32;
        int inputByte ;

        while(true) {
            inputByte = System.in.read();

            if(inputByte == 32) {           // 공백 처리
                if(prevByte != 32) count++; // 단어 처리
            }

            else if(inputByte == 10) {      // 개행 처리
                if(prevByte != 32) count++; // 단어 처리 (마지막)
                break;
            }
            prevByte = inputByte;
        }
        System.out.println(count);
    }
}
