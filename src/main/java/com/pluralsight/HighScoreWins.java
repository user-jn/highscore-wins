package com.pluralsight;
import java.util.Scanner;
public class HighScoreWins {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("***High Score Wins***\n");

    // get inputs
    System.out.print("Enter game score in the following format (TeamName1:TeamName2|Score1:Score2:)");
    String scores = scnr.nextLine().trim();//scans lines & removes extra spaces

    // split into array
    String[] arr_scores = scores.replace("|", ":").split(":");
    int score1 = Integer.parseInt(arr_scores[2].trim());
    int score2 = Integer.parseInt(arr_scores[3].trim()); //convert array index to int

    // winner logic and matching outputs with display

    String winner = "Tie";
    if (score1 > score2) {
        winner = arr_scores[0].trim(); //associated score1 with array index 0 (team 1)
    }
    else if (score1 < score2) {
        winner = arr_scores[1].trim(); // associated score2 with array index 0 (team 2)
    }
    System.out.println("Winner: " + winner);

     scnr.close();
    }
}
