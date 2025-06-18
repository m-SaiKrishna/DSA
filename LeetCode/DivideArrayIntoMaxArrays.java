import java.util.*;
public class DivideArrayIntoMaxArrays {
    public static void main(String args[]){
        int[] arr = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        int [][] ans =  divideArray(arr,k);
        for(int i = 0 ; i < ans.length; i++){
            for(int j = 0 ; j<ans[i].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

     public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
       int size = nums.length;
        int[][] ans = new int[size/3][3];
            int j = 0;
        for(int i = 2 ; i < nums.length; i+=3){
            if((nums[i] - nums[i-2]) > k){
                return new int[0][0];
            }
            
            
            ans[j][0] = nums[i - 2];
            ans[j][1] = nums[i-1];
            ans[j][2] = nums[i];

            j += 1;
            
        }
        return ans;
    }
}
