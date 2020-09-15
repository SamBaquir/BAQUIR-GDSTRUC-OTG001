package com.company;

public class Main {

    public static void main(String[] args) {

        float[] floatNumbers = new float [20];

        // Variable increment holds the value of each element
        int increment = 1;

        // Assigning values to each element
        for (int i = 0; i < floatNumbers.length; i++)
        {
            floatNumbers[i] = increment;
            increment++;
        }

        // Print all contents of the array

        for (int i = 0; i < floatNumbers.length; i++) {
            System.out.println(floatNumbers[i]);
        }

    }
}
