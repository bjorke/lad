/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad;

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
        long timeTest = 0;
        for (int i = 0; i < 100; i++) {
            timeTest += Lad.startTimeTest();
        }
        System.out.println("Total time taken is;" + timeTest);
        timeTest = timeTest / 100;
        System.out.println("Total time per operation is in nano seconds is;" + timeTest);
        // Get elapsed time in milliseconds
        double elapsedTimeMillis = timeTest / 1000000000.0;
        System.out.println("Total time per operation in seconds is;" + elapsedTimeMillis);


    }

    public static long startTimeTest() {
        long start = System.nanoTime();

        //The integer array generates 10000 numbers with numbers up to 100.
        int[] i = new int[10000];
        Random randomGenerator = new Random();
        for (int idx = 0; idx < 10000; idx++){
            int randomInt = randomGenerator.nextInt(100);
            i[idx]=randomInt;
        }
        int[] a = Lad.insertionSort(i);
        //loops the return from the insertionSort method
        /*
        for (int iLoop = 0; iLoop < a.length; iLoop++) {
            //System.out.println("a;" + a[iLoop]);
        }
        */
        //stops the log time subtracts the start time from the finishing time and prints it.
        long end = System.nanoTime();
        long duration = end - start;
        //System.out.println("Sorting took " + duration + " ms");

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
        return a;
    }
}
