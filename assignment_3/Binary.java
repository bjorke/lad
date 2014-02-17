import java.lang.System;

class Binary {

    /** Convert a non-negative integer to binary representation. */
    public static String toBinaryString(int n) {

        // TODO
        return null;
    }

    public static void main (String args[]) {
        System.out.println("Starting");
        for (String arg : args) {
            System.out.println("Output;"+toBinaryString(Integer.parseInt(arg)));
        }
    }
}
