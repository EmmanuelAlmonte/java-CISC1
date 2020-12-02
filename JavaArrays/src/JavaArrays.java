/*
 * a Java I-P-O program that works
 *  with a small array of data containing five test scores.
 * The Test scores are in a separate txt file and will be stored in an array.
 * Created for CSCI 111
 * last modified November 29, 2020.
 * @ author A. Emmanuel
 * File must already exist in the same folder.
 */


import java.io.File;
import java.lang.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class JavaArrays {
    public static void main(String[]args) throws Exception {

        File score_f = new File("test_f.txt");// Create a new text file to store the the data of test scores
        //java.io.PrintWriter score_w = new java.io.PrintWriter(score_f);// Print Writer class inputs the code into the file.

        float lowest_score ;// store the lowest score
        float highest_score=0;// stores the highest score
        float average =0 ;//stores the average
        float sum;// stores sum that will be used to get average
        sum = 0;// initializes sum
        int y = 0;//this is one of the counters and I possibly could have set one two zero instead of having two initializes the counter y
        String score;// to store the value of the score
        float[] test_score = new float [5];// This is the float point Array that is going to be used to store all scores
        float count;// Counter to use in for loop
        Scanner user = new Scanner(Paths.get(String.valueOf(score_f)));// to read the file
        int i;// the argument used in the for loop

        //main for loop used to get user input and store it in Array
        for (i = 0; i < 5; i++)
        {
            test_score[i] = user.nextFloat();
            //score = JOptionPane.showInputDialog("Enter your score: ");// Get user data
            //float x = Float.parseFloat(score);// Convert value
            //test_score[i] = x;// store user data in Array
            //System.out.println(test_score[i]);


        }

        lowest_score = test_score[y];
        // This for loops gets the High , low and average score.
        for(y=0; y< test_score.length; y++) {
            if(test_score[y] > highest_score){ // find high score
                highest_score = test_score[y];// store high score
            }
            if(test_score[y] < lowest_score){// find low score
                lowest_score = test_score[y];// store low score
            }
            sum = sum + test_score[y];// gets sum to average
            average = sum / test_score.length;// Math to get average



        }
        // printing high low and average
        System.out.println("The average of test scores: " + average+ "\n" +
                "The Highest test score: "+highest_score + "\nThe Lowest test score: " + lowest_score);
        System.out.println();

    }

}
