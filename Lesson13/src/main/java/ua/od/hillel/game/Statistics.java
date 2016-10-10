package ua.od.hillel.game;

import java.util.ArrayList;
import java.util.List;

public class Statistics {

    private List<GameResult> results;

    public Statistics() {
        results = new ArrayList<>();
    }

    public void addResult(GameResult result) {
        results.add(result);
    }

    @Override
    public String toString() {
        return results.toString();
    }

}
