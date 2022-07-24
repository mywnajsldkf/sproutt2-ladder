package controller;

import model.Ladder;
import model.Line;

import java.util.ArrayList;
import java.util.List;

public class LadderGame {

    int height;

    public Ladder generateLadder(int height, int player) {
        List<Line> lines = new ArrayList<>();

        for (int i = 0; i < height; i++) {
            lines.add(new Line(player));
        }
        return new Ladder(lines);
    }
}