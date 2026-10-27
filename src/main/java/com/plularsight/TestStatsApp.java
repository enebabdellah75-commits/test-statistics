package com.plularsight;

public class TestStatsApp {

    public static void main(String[] args) {

        // create an array with 10 test scores
        int[] testScores = {85, 90, 78, 92, 88, 76, 95, 84, 89, 93};

        /*
         our loops go below this comment
         */

        int sum = 0;
        int highest = testScores[0];
        int lowest = testScores[0];

        for (int score : testScores) {
            sum += score;

            if (score > highest) {
                highest = score;
            }

            if (score < lowest) {
                lowest = score;
            }
        }

        // figure out the average test score
        double average = (double) sum / testScores.length;
        System.out.println("Average: " + average);

        // figure out the highest test score
        System.out.println("Highest score: " + highest);

        // figure out the lowest test score
        System.out.println("Lowest score: " + lowest);













    }
}
