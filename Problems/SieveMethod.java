package Problems;
import java.util.*;
public class SieveMethod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // List<Integer> ans = isPrimesInRange(num);
        // for(int ele : ans) System.out.print(ele+" ");
        sieveMethod(num);

    }
    // public static  List<Integer> isPrimesInRange(int n){
    //     List<Integer> list = new ArrayList<>();
    //     for(int i = 2; i <= n; i++)
    //         if(isPrime(i))
    //             list.add(i);
    //     return list;
    // } 

    // public static boolean isPrime(int num){
    //     for(int i = 2; i * i <= num; i++){
    //         if(num % i == 0) return false;
    //     }
    //     return true;
    // }



    public static void sieveMethod(int num){
        boolean[] arr = new boolean[num+1];
        arr[0] = true;
        arr[1] = true;

        for(int i = 2 ; i <= Math.sqrt(num); i++){
            for(int j = i; j <= num; j+=i){
                if(i == j) continue;
                else {
                    arr[j] = true;
                }
            }
        }
        for(int i = 0; i < arr.length; i++)
        if(!arr[i])
        System.out.print(i+" ");
    }
}
    
        

            
