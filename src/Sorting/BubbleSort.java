package Sorting;

import java.util.Arrays;

public class BubbleSort {

    static void  bSort(int[] arr, int n){

        boolean swapped;
        for(int i=0; i<n-1; i++){

            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped =true;
                }
            }
            if(swapped = false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,1,5,4,6};
        int n = arr.length;
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(arr));
        bSort(arr,n);
        System.out.println("Array after Sorting");
        System.out.println(Arrays.toString(arr));

    }
}
