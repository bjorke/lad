/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad;

/**
 *
 * @author administrator
 */
public class Lad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long start = System.currentTimeMillis();

        int[] i = {10, 29, 98, 75, 16, 53, 4, 23, 2, 1, 10, 29, 98, 75, 16, 53, 4, 23, 2, 1, 10, 29, 98, 75, 16, 53, 4, 23, 2, 1, 10, 29, 98, 75, 16, 53, 4, 23, 2, 1, 10, 29, 98, 75, 16, 53, 4, 23, 2, 1, 10, 29, 98, 75, 16, 53, 4, 23, 2, 1, 10, 29, 98, 75, 16, 53, 4, 23, 2, 1, 10, 29, 98, 75, 16, 53, 4, 23, 2, 1, 10, 29, 98, 75, 16, 53, 4, 23, 2, 1, 10, 29, 98, 75, 16, 53, 4, 23, 2, 1};
        int[] a = Lad.insertionSort(i);
        for (int iLoop = 0; iLoop < a.length; iLoop++) {
            System.out.println("a;" + a[iLoop]);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Sorting took " + duration + " ms");

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
