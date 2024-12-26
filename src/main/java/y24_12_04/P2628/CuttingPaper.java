package y24_12_04.P2628;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.parseInt;

public class CuttingPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] maxLength = bf.readLine().split(" ");
        int lineCount = parseInt(bf.readLine());
        int rowLength = parseInt(maxLength[0]);
        int colLength = parseInt(maxLength[1]);

        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();

        while(lineCount --> 0){
            String[] cuttingLine = bf.readLine().split(" ");

            if(cuttingLine[0].equals("0")){
                rows.add(parseInt(cuttingLine[1]));
            }else{
                columns.add(parseInt(cuttingLine[1]));
            }
        }
        Collections.sort(rows);
        Collections.sort(columns);
        int maxRowGap = 0;
        int maxColGap = 0;
        int prevRowCut = 0;
        int prevColCut = 0;

        for (Integer row : rows) {
            maxRowGap = Math.max(maxRowGap, row - prevRowCut);
            prevRowCut = row;
        }
        for (Integer column : columns) {
            maxColGap = Math.max(maxColGap, column - prevColCut);
            prevColCut = column;
        }

        maxRowGap = Math.max(colLength - prevRowCut, maxRowGap);
        maxColGap = Math.max(rowLength - prevColCut, maxColGap);
        System.out.println(maxRowGap * maxColGap);
    }
}
