package Sorting;

import java.util.Arrays;

public class InsertionSort {

    static void iSort(int[] array, int arrayLength){



    }

    public static void main(String[] args) {
        int array[] = {9,4,7,2,6,1};
        int arrayLength = array.length;

        System.out.println("Array before insertion Sort");
        System.out.println(Arrays.toString(array));

        iSort(array, arrayLength);

        System.out.println("Array After insertion Sort");
        System.out.println(Arrays.toString(array));

    }
}
