package Sorting;

import java.util.Arrays;

public class selectionSort {

    static void sSort(int arr[], int n){

        for(int i=0; i<n; i++){
            int minIndex = i;
            for (int j=i+1; j<n; j++){

                if(arr[minIndex] < arr[j])
                    minIndex = j;
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[j];
                    arr[j] = temp;

            }
        }


    }

    public static void main(String[] args) {
        int[] arr = {10,1,5,4,6};
        int n = arr.length;
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(arr));
        sSort(arr,n);
        System.out.println("Array after Sorting");
        System.out.println(Arrays.toString(arr));
    }
}
