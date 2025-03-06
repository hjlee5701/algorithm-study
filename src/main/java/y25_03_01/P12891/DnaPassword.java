package y25_03_01.P12891;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DnaPassword {
    static int[] dnaCount;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        char[] dna = new char[S];
        int[] nowCount = new int[4];
        dnaCount = new int[4];
        int result = 0;

        for(int i = 0; i < S; i++) { //몇 개 있는지 체크
            dna[i] = str.charAt(i);

            if(dna[i] == 'A') nowCount[0]++;
            if(dna[i]=='C') nowCount[1]++;
            if(dna[i]=='G') nowCount[2]++;
            if(dna[i]=='T') nowCount[3]++;
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++) {//최소로 들어가야하는 개수
            dnaCount[i] = Integer.parseInt(st.nextToken());
        }

        if(!isValidPw(nowCount)) {
            System.out.print(result);
            return;
        }

        nowCount = new int[4];

        for(int i = 0; i < P; i++) { //슬라이딩하기 위한 초기화 과정
            if (dna[i] == 'A') nowCount[0]++;
            else if (dna[i] == 'C') nowCount[1]++;
            else if (dna[i] == 'G') nowCount[2]++;
            else nowCount[3]++;
        }
        if(isValidPw(nowCount)) result++;

        for(int j = P; j < S; j++) { //j는 뒷부분 인덱스
            int k=j-P; //i는 앞부분 인덱스

            if (dna[k] == 'A') nowCount[0]--;
            else if (dna[k] == 'C') nowCount[1]--;
            else if (dna[k] == 'G') nowCount[2]--;
            else if (dna[k] == 'T') nowCount[3]--;

            if (dna[j] == 'A') nowCount[0]++;
            else if (dna[j] == 'C') nowCount[1]++;
            else if (dna[j] == 'G') nowCount[2]++;
            else if (dna[j] == 'T') nowCount[3]++;

            if(isValidPw(nowCount)) result++;
        }

        System.out.print(result);
    }

    public static boolean isValidPw(int[] nowCount) {
        for (int i = 0; i < 4; i++) {
            if(nowCount[i] < dnaCount[i])
                return false;
        }
        return true;
    }
}
