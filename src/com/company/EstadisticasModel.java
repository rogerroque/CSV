package com.company;

public class EstadisticasModel {

    private String homeTeam;
    private String matchDate;
    private int players;
    private int points;
    private int assists;
    private int wins;
    private int loses;

    public EstadisticasModel(String homeTeam, String matchDate, int players, int points, int assists, int wins, int loses) {
        this.homeTeam = homeTeam;
        this.matchDate = matchDate;
        this.players = players;
        this.points = points;
        this.assists = assists;
        this.wins = wins;
        this.loses = loses;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int player) {
        this.players = player;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }


    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    @Override
    public String toString() {

        return "Home Team: " + homeTeam + "\n" +
                "Match date: " + matchDate + "\n" +
                "Player: " + players + "\n" +
                "Points: " + points + "\n" +
                "Assists: " + assists + "\n" +
                "Wins: " + wins + "\n" +
                "Loses: " + loses + "\n";

    }
}
