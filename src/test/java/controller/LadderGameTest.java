package controller;

import model.Ladder;
import model.Winning;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LadderGameTest {

    @Test
    public void ladderGameTest() {
        LadderGame ladderGame = new LadderGame();
        GenerateStringLadder generateStringLadder = new GenerateStringLadder();

        /*
        List<Player> players = new ArrayList<>();
        players.add(new Player("july"));
        players.add(new Player("rayna"));
        players.add(new Player("lua"));
        players.add(new Player("zoe"));

         */

        List<Winning> winnings = new ArrayList<>();
        winnings.add(new Winning("꽝"));
        winnings.add(new Winning("1000"));
        winnings.add(new Winning("2000"));
        winnings.add(new Winning("3000"));

        Ladder ladder = ladderGame.generateLadder(3, 4);

        // List<ArrayList<String>> generatedLadder = generateStringLadder.generateStringLadder(players,ladder.getLines(), winnings);

        // System.out.println(generateStringLadder.generateStringLadder(players, ladder.getLines(), winnings));

        // 사다리 출력
        /*
        for (int i = 0; i < generatedLadder.size(); i++) {
            String result = generatedLadder.get(i).stream()
                    .map(n -> String.valueOf(n))
                    .collect(Collectors.joining());

            System.out.println(result);
        }

         */
    }
}
