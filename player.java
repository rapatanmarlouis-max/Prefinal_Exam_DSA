/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class player {
    String playerId; String name; String teamName; double score;
    public player(String playerId, String name, String teamName, double score) {
        this.playerId = playerId; this.name = name; this.teamName; this.score = score;
    }
    public double getScore() { return score; } 
    
    
    @Override
    public String toString() {
        return name + "(" + score + ")";
    }
    public String toDetailedString(){
        return String.format("%-8s %-15s %.2f", playerId, name, teamName, score);
    }
}
    
    

