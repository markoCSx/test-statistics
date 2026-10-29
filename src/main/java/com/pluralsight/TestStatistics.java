package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {

    public static void main(String[] args) {

        double placeHolder;
        double[] scores = {70, 50, 60, 55, 65, 77, 99, 100};

        placeHolder = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > placeHolder) {
                placeHolder = scores[i];
            }
        }/*end*/
        double highScore = placeHolder;
        System.out.println("Highest Score: " + highScore);

        placeHolder = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < placeHolder) {
                placeHolder = scores[i];
            }
        }/*end*/
        double lowScore = placeHolder;
        System.out.println("Lowest Score: " + lowScore);

        double total = 0;

        for (double i : scores) {
            total += i;
        }

        double avg = total / scores.length;

        System.out.printf(String.format("Average: %.2f\n", avg));

        //median
        Arrays.sort(scores);
        double median;
        int middle = scores.length / 2;
        if (scores.length % 2 == 0) {
            median = (scores[middle-1] + scores[middle]) / 2;
        } else {
            median = middle;
        }/*end*/

        System.out.printf(String.format("Median: %.2f\n", median));
    }
}
