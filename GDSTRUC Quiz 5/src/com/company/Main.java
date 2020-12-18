package com.company;

public class Main {

    public static void main(String[] args) {

        int numbers[] = {-15,-9, 1, 3, 7, 15, 20, 28, 53, 70, 84};
        int sevenUp[] = new int[7];
        sevenUp(numbers, sevenUp);
    }

    public static void sevenUp (int[] input, int[] newArray)
    {
        int newArrayElement = 0;

        for (int i = 0; i < input.length; i++)
        {
            if (input[i] % 7 == 0)
            {
                newArray[newArrayElement] = input[i];
                newArrayElement++;
            }
        }

        if (newArrayElement > 0)
        {
            System.out.println("Seven Up!");
            for (int i = 0; i < newArray.length; i++)
            {
                if (newArray[i] == 0) return;
                System.out.println("Element: " + i + " = " + newArray[i]);
            }
        }
        else {
            System.out.print("No digits divisible by 7.");
        }
    }
}
