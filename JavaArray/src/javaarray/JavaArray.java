/*
 * a Java I-P-O program that works
 *  with a small array of data containing five test scores.
 * The Test scores are in a separate txt file and will be stored in an array.
 * Once scored they are stored in array program will calculate lowest Highest and average score
 * Then program will write it to another file
 * Created for CSCI 111
 * last modified November 29, 2020.
 * @ author A. Emmanuel
 * File must already exist in the same folder.
 */
package javaarray;

import java.io.File;
import java.io.FileWriter;
import java.lang.*;
import java.nio.file.Paths;
import java.util.Scanner;
public class JavaArray {

    public static void main(String[] args)throws Exception {

        float[] test_score = new float [5];// This is the float point Array that is going to be used to store all scores
        float highest_score=0;// stores the highest score
        float sum = 0;// initializes sum
        read_score(test_score);// read data into an array
        float lowest = lowest_score(test_score); //calls method and enters the array as an argument
        float average_1 = average_score(test_score);// calls average method and enters array as argurment
        highest_score= highest_score(test_score);// calls the highest_score method and enters array as argument.
        write_score(average_1,lowest,highest_score);//writes all the scores to a new file names results.txt


    }// End main method
    // method will read the score from file and into an array
    public static float[] read_score(float []score)throws Exception
    {
        int i; // counter
        File score_f = new File("test_f.txt");// Create a new text file to store the the data of test scores
        Scanner user = new Scanner(Paths.get(String.valueOf(score_f)));// to read the file
        // for loop to read every score.
        for (i = 0; i < 5; i++) {
            score[i] = user.nextFloat();
        }
        return score;// returns the value
    }//end read_score
    // this method will calculate low score
    public static int lowest_score(float[] score)
    {
        int min = (int) score[0];// min variable to store lowest score
        int i ;
        for(i = 0; i <score.length; i++)// for loop to calculate lowest score.
        {
            if(score[i]<min)
                min= (int) score[i];
        }
        return min;// returns lowest score
    }//end lowest score
    //method to calculate average score
    public static float average_score(float[] score)
    {
        int i;
        float sum = 0;// sum needed to get average
        float average;

        for(i=0; i<score.length; i++){// for loop to get average
            sum = sum +score[i];

        }
        average = sum/score.length;
        return average;//returns average score
    }//end average score.

    // This method calculate highest score
    public static float highest_score(float[]score) {
        int i;
        float sum = 0;
        float highest_score = 0;// holds value for highest score.

        for (i = 0; i < score.length; i++) {
            if (score[i] > highest_score) { // find high score
                highest_score = score[i];// store high score
            }
        }
        return highest_score;// returns the highest value in array
    }//end highest_score.

    // this method writes average, lowest and highest scores in a new text file.
    public static void write_score(float avg, float lowest, float highest) throws Exception {
        File file = new File("results.txt");
        FileWriter score_write = new FileWriter("results.txt");
        // the following code writes the all the scores that we calculated for
        score_write.write("average score: " + avg +"\n");
        score_write.write("lowest score: " + lowest +"\n");
        score_write.write("higest score: " + highest +"\n");


        score_write.close();//closing score_write



    }//end write_score





}//end main class
