package Sorting;

import java.util.Arrays;

public class MergeSort {

    static int[] mSort(int[] arr, int start, int end) {

        if(end-start+1>=1){
            return arr;
        }
        int middle= (start+end)/2;
        mSort(arr, start, middle);
        mSort(arr, middle+1, end);

        merge(arr, start, end/2,end);

        return arr;
    }

    static void merge(int[] arr, int low, int mid, int high){
        int[] leftArr = new int[mid-low];
        int[] rightArr = new int[high-mid+1];

        System.arraycopy(arr,0,leftArr,0,leftArr.length);
        System.arraycopy(arr,mid,rightArr,0,rightArr.length);

        System.out.println(Arrays.toString(leftArr));
        System.out.println(Arrays.toString(rightArr));

       int leftArrPointer = 0;
       int rightArrPointer = 0;
       int k =low;
       while(leftArrPointer<leftArr.length && rightArrPointer<rightArr.length){

           if(leftArr[leftArrPointer] <= rightArr[rightArrPointer]){
                arr[k] = leftArr[leftArrPointer];
               leftArrPointer++;
               k++;
           }else{
               arr[k] = rightArr[rightArrPointer];
               rightArrPointer++;
               k++;
           }
       }

       while(leftArrPointer<leftArr.length-1){
           arr[k] = leftArr[leftArrPointer];
           leftArrPointer++;
           k++;

       }

        while(rightArrPointer<=rightArr.length-1){
            arr[k] = rightArr[rightArrPointer];
            rightArrPointer++;
            k++;

        }
    }




    public static void main(String[] args) {
        /*
        int arr[] = {9,4,7,2,6,1};

        int start = 0;
        int end=arr.length -1;

        System.out.println("Array before insertion Sort");
        System.out.println(Arrays.toString(arr));

        mSort(arr, start, end);

        System.out.println("Array After insertion Sort");
        System.out.println(Arrays.toString(arr));
        */
        int arr[] = {7,8,9,1,2,3};
        int start = 0;
        int end=arr.length -1;
        mSort(arr, start, end);
        //merge(arr,0,arr.length/2,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }


}
