package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10,2,6,11,64,69,33};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
           
               
                int index = findMin(arr, i);
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            
        }
        System.out.println(Arrays.toString(arr));
    }


    public static int findMin(int[] arr,int i){
        int min = arr[i],index = i;
        for(int ind = i + 1; ind < arr.length; ind++){

              if(arr[ind] < min){
                min = arr[ind];
                index  = ind;
              }
        }
        return index;
    }
}
