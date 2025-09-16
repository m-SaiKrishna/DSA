public class NumberOfZeroFilledSubArrays {
    public static void main(String[] args) {
        int[] arr = {0,0,0,2,0,0};
        System.out.println(zeroFilledSubarray(arr));
    }
     public static long zeroFilledSubarray(int[] nums) {
      long cnt = 0, max = 0;
      for(int num : nums){
    //   for(int num : nums){
        if(num == 0){
            max += 1;
            cnt += max;
        }
        else{
            max = 0;
        }
      }
       return cnt;
    }
}
