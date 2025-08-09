package TwoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        // System.out.println(bruteForce(arr));
        System.out.println(optimal(arr));
    }


    // public static int bruteForce(int[] arr){
    //     int max = Integer.MIN_VALUE;
    //     for(int i = 0; i < arr.length; i++){
    //         for(int j = i+1; j<arr.length; j++){
    //             int minele = Math.min(arr[i],arr[j]);
    //             max = Math.max(max,(minele*(j - i)));
    //         }
    //     }
    //             return max;
    //         }
        


    public static int optimal(int[] arr){
        int i = 0, j = arr.length-1,max = Integer.MIN_VALUE;
        while(i <= j){
            if(arr[i] < arr[j]){
            max = Math.max(max,arr[i] * (j-i));
            i++;
        }
        
        else{
                max = Math.max(max,arr[j] * (j-i));
                j--;
                //j--;

            }
        }
        return max;
    }


}



