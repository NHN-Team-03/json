package com.nhnacademy.json.collab;

public class Record {

    private int numberOfMatches;
    private int numberOfWins;

    public Record(int numberOfMatches, int numberOfWins) {
        this.numberOfMatches = numberOfMatches;
        this.numberOfWins = numberOfWins;
    }

    public int getNumberOfMatches() {
        return numberOfMatches;
    }

    public void setNumberOfMatches(int numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }
}
