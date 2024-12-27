package y24_12_04.P5568;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class PlacingCard {
    private int cardsCount;
    private String[] cardNumbers;
    private HashSet<String> cardComp;
    private boolean[] visited;

    private void makingCardCombination(int selectCount, int cardIdx, String currentCombination){
        if (selectCount == 0) {
            this.cardComp.add(currentCombination);
            return;
        }
        for(int i = 0; i < cardsCount; i++){
            if (visited[i]) continue;
            visited[i] = true;
            makingCardCombination(selectCount - 1, cardIdx + 1, currentCombination + cardNumbers[i]);
            visited[i] = false;
        }
    }

    private void cardCombinationCount() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        cardsCount = Integer.parseInt(br.readLine());
        int selectCount = Integer.parseInt(br.readLine());

        cardNumbers = new String[cardsCount];
        visited = new boolean[cardsCount];
        cardComp = new HashSet<>();

        for(int i = 0; i < cardsCount; i++){
            cardNumbers[i] = br.readLine();
        }

        makingCardCombination(selectCount, 0, "");
        System.out.println(cardComp.size());
    }
    public static void main(String[] args) throws Exception {
        new PlacingCard().cardCombinationCount();
    }
}