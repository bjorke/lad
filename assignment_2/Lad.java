/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package Lad;
/**
 * @author administrator
 */

import java.util.Random;

public class Lad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //start the loging
        Lad.timeTester();
    }

    public static void timeTester() {
        System.out.println("timeTester");
        long totalTime = 0;
        //Loops the test 100 times
        for (int i = 0; i < 100; i++) {
            totalTime += Lad.startTimeTest();
        }
        //Prints the total time for all operations
        System.out.println("Total time taken in nanoseconds is;" + totalTime);
        System.out.println("Total time taken in seconds is;" + totalTime / 1000000000.0);
        //Divides the total time by the total number of loops
        long perOperationTime = totalTime / 100;
        //Prints the average time per operation
        System.out.println("Total time per operation is in nanoseconds is;" + perOperationTime);
        System.out.println("Total time per operation in seconds is;" + perOperationTime / 1000000000.0);


    }

    public static long startTimeTest() {
        long start = System.nanoTime();

        //The integer array generates 10000 numbers with numbers up to 100.
        int[] i = new int[10000];
        Random randomGenerator = new Random();
        for (int idx = 0; idx < 10000; idx++) {
            int randomInt = randomGenerator.nextInt(100);
            i[idx] = randomInt;
        }
        //Start the sorting with generated integer array
        Lad.insertionSort(i);
        //stops the log time subtracts the start time from the finishing time and prints it.
        long end = System.nanoTime();
        long duration = end - start;

        return duration;


    }

    public static int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            // Invariant: a[0..i-1] is already sorted.
            final int cur = a[i];
            // Now insert cur into a[0..i-1],
            // shifting greater elements upward.
            int j = i;
            while (j > 0 && a[j - 1] > cur) {
                a[j] = a[--j];
            }
            a[j] = cur;
        }
        //Returns the array
        return a;
    }
}
