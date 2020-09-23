package com.company;

public class Main {

    public static void main(String[] args) {

        //The array to be sorted
        int[] intNumbers = new int [10];
        intNumbers[0] = 26;
        intNumbers[1] = 126;
        intNumbers[2] = 6;
        intNumbers[3] = 2;
        intNumbers[4] = -6;
        intNumbers[5] = -2;
        intNumbers[6] = -126;
        intNumbers[7] = -26;
        intNumbers[8] = 62;
        intNumbers[9] = 16;

        //Please uncomment only one of them :)

        //For using the BubbleSort in descending order (Largest to Smallest)
        System.out.println("Before bubble sort:");
        printArrayElement(intNumbers);
        bubbleSort(intNumbers);
        System.out.println("\n\nAfter bubble sort:");
        printArrayElement(intNumbers);

//        //For using the SelectionSort in descending order (Largest to Smallest)
//        System.out.println("Before selection sort:");
//        printArrayElement(intNumbers);
//        selectionSort(intNumbers);
//        System.out.println("\n\nAfter selection sort:");
//        printArrayElement(intNumbers);
    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;
            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void printArrayElement(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
