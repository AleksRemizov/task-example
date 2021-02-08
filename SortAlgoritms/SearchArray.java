package com.company;

public class SearchArray {
    public static void main(String[] args) {
        int[] array = {10, 15, 18, 45, 60, 45, 77,};
        int[] arrayRandom = {30, 32, 75, 16, 44, 22, 24, 36, 88, 85, 47, 85, 56, 32, 5, 69, 86, 45, 82, 66, 88, 23, 62, 36, 79, 30, 66, 15, 57, 95, 71, 76, 25, 36, 57, 50, 19, 38, 42, 23, 57, 99, 63, 16, 91, 54, 68, 80, 47, 55, 100, 38, 24, 22, 34, 4, 36, 38, 18, 65, 36, 13, 40, 37, 12, 52, 50, 63, 80, 35, 20, 82, 13, 99, 80, 94, 88, 38, 61, 80, 60, 73, 17, 89, 73, 90, 72, 56, 82, 35, 93, 71, 61, 63, 74, 86, 94, 27, 29, 14};
        printMaximumElement(arrayRandom);

    }
    static void printMaximumElement (int [] array){
        int max = array[0];
        int maxIndex = 0;
        int comparisons =0;
        int replacements =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
                maxIndex = i;
                replacements++;
            }
            comparisons++;
        }
        System.out.println("Max element: " + max);
        System.out.println("Max element index: " + maxIndex);
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Replacements: " + replacements);

    }
}
