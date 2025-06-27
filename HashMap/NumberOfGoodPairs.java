import java.util.*;
class NumberOfGoodPairs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(numberOfGoodPairs(arr));
            
    }


    public static int numberOfGoodPairs(int[] arr){
        int pairs = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]) pairs++;
            }
        }
        return pairs;
    }
}



    
