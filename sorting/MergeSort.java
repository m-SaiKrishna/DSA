package sorting;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,6,2};

        mergeSort(arr,0,arr.length-1);
        for(int ele : arr) System.out.print(ele+" ");
    }

    public static void mergeSort(int[] arr, int l, int r){

            if(l < r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);

            merge(arr,l,mid,r);
            }


    }


    public static void merge(int[] arr,int l , int mid, int r){

        int n1 = mid - l + 1;
        int n2 = r -  mid;

        int larr[] = new int[n1];
        int rarr[] = new int[n2];

        for(int i = 0; i<n1; i++){
            larr[i] = arr[l+i];
        }
        for(int i = 0; i<n2; i++){
            rarr[i] = arr[mid+1+i];
        }

        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2){
            if(larr[i] < rarr[j]){
                arr[k] = larr[i];
                i++;
            }
            else{
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = larr[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }

}
