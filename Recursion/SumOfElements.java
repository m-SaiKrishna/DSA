class SumOfElements{
    public static void main(String args[]){
        int[] arr  = {1,2,33};
        System.out.println(sumOfElements(arr,0));
    }

    public static int sumOfElements(int[] arr, int i){
        
        if(i == arr.length) return 0;
        return arr[i] - sumOfElements(arr, i + 1);
    }
}