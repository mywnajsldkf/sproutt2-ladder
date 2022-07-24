package controller;

import model.Line;
import model.Player;
import model.Winning;

import java.util.ArrayList;
import java.util.List;

public class GenerateStringLadder {
    private static final String POINT = "|";
    private static final String EMPTY = "     ";
    private static final String CONNECTION = "-----";

    public List<ArrayList<String>> generateStringLadder(List<Player> players, List<Line> lines, List<Winning> winnings) {
        List<ArrayList<String>> generatedStringLadder = new ArrayList<>();

        // generatedStringLadder.add(toStringParticipantList(players));

        for (Line value : lines) {
            ArrayList<String> generatedLine = new ArrayList<>();
            Line line = value;
            generatedLine.add(POINT);

            for (int j = 0; j < line.getLine().size(); j++) {
                if (!(line.getLine().get(j)).getConnection()) {
                    generatedLine.add(EMPTY);
                }
                if (line.getLine().get(j).getConnection()) {
                    generatedLine.add(CONNECTION);
                }
                generatedLine.add(POINT);
            }
            generatedStringLadder.add(generatedLine);
        }

        //generatedStringLadder.add(toStringWinningList(winnings));

        return generatedStringLadder;
    }

    /*
    private ArrayList<String> toStringParticipantList(List<Player> players) {
        ArrayList<String> stringParticipantList = new ArrayList<>();
        for (Player player : players) {
            stringParticipantList.add(player.getName());
            stringParticipantList.add("  ");
        }
        return stringParticipantList;
    }

     */


    /*
    private ArrayList<String> toStringWinningList(List<Winning> winnings) {
        ArrayList<String> stringWinningList = new ArrayList<>();
        for (Winning winning : winnings) {
            stringWinningList.add(winning.getWinningInput());
            stringWinningList.add("  ");
        }
        return stringWinningList;
    }

     */
}