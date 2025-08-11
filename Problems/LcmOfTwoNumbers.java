public class LcmOfTwoNumbers {
    public static void main(String[] args) {
        int[] arr = {2,3,6};
        System.out.println(lcm(arr));
    }

    //public static int lcmOfTwoNumbers(int n, int m){
    //     int  min = Math.min(n,m) , ans = 1;
    //     for(int i = 2; i <= min; i++){
    //         if(n % i == 0 && m % i == 0){
    //             ans *= i;
    //             n /= i;
    //             m /= i;
    //         }
    //     }
    //     ans *= n;
    //     ans *= m;
    //     return ans;
    // }
    // /*while(b!=0){
    //  * int temp = b;
    //  * b = b % a;
    //  * a = temp
    //  * 
    // }  return a*/
   //}

    
   public static int lcm(int[] arr){
    int lcm = arr[0];
    for(int i = 1; i < arr.length; i++){
        lcm = (lcm * arr[i])/gcd(lcm,arr[i]);
    }

    return lcm;
   }
   
   
   public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
