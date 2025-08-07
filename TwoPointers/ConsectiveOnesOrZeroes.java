package TwoPointers;

public class ConsectiveOnesOrZeroes {
  public static void main(String[] args) {
    int[] arr = {0,1,0,1,1,1,1,0,0,0,0,0};
    System.out.println(maxConsective(arr));
  } 
  
  public static int maxConsective(int[] arr){
    int max = 0, cnt = 1;
    for(int i = 1; i < arr.length; i++){
        if(arr[i-1] == arr[i]) cnt++;
        else {
            max = Math.max(cnt,max);
            cnt = 1;
        }
    }
    return Math.max(max,cnt);
  }
}
