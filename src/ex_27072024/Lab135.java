package ex_27072024;

public class Lab135 {
    public static void main(String[] args) {
        // Single-Dimensional Arrays
        //  have only one dimension, representing a list of elements.
        int [] ages = {90,91,93}; //  This is called Single-Dimensional Arrays
        int [] ages2 = new int[10]; // This how we initialize in Single-Dimensional Arrays

        // Multi-Dimensional Arrays
        //  have two or more dimensions, representing a table or grid of elements.
        // AT - 2D, 3D - Coding Questions.
        int[] array_1d = {450, 50, 321};

        //  2D
        int[][] array_2d_2 = new int[3][3];
        // |0|0|0|
        // |0|0|0|
        // |0|0|0|
        array_2d_2[0][0] = 34;
        // |34,0,0|
        // |0,0,0|
        // |0,0,0|
        array_2d_2[0][1] = 12;
        // |34,12,0|
        // |0,0,0|
        // |0,0,0|
    }
}

