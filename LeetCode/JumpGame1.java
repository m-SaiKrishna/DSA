import java.util.*;
public class JumpGame1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(canJump(arr));
    }

   
    public static boolean canJump(int[] nums) {
        
        if(nums.length == 1) return true;
        int c = 0 , f = 0;
        for(int i = 0; i < nums.length; i++){
            f = Math.max(f, i+nums[i]);

            if(i == c){
                
                c = f;
            }
        }

        return c >= nums.length-1;
    }


}