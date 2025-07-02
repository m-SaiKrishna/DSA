import java.util.*;
public class PerfectSquares {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m  = sc.nextInt();
    int c = 0;
    int[] squares = {1,4,9,16,25,36,49,64,81,100,121,144,169,196,225};
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            int num = sc.nextInt();
            if(isSquare(num, squares)) c++;
        }
    }
    if(n<0 || m<0) System.out.println("Invalid Numbers");
    else if(c!=0) System.out.println(c);
    else System.out.println("NO Perfect Squares.");
}

    public static boolean isSquare(int num, int squares[]){
        for(int i=0;i<squares.length;i++){
            if(Math.abs(num) == squares[i]) return true;
        }
        return false;
    }   
    
} 