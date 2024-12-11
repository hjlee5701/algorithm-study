package y24_12_02.P11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASCII {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ascii = br.readLine().charAt(0);
        System.out.println((byte)ascii);
    }
}
