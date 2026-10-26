package com.pluralsight;

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

        placeHolder = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < placeHolder) {
                placeHolder = scores[i];
            }
        }/*end*/
        double lowScore = placeHolder;

        double total = 0;
        for (double i : scores) {
            int j = 0;
            total += scores[j];
            j++;
        }

        double avg = total / scores.length;

        System.out.println(String.format("%.2f", avg));
    }
}
