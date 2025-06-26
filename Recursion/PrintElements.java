public class PrintElements {
    public static void main(String[] args) {
        int n = 3;
        printToN(n, 3);
    }

    public static int printToN(int n , int i){
        if(i < 1) return 1;
        System.out.println(i);
        return printToN(n, i - 1); 
      
    }
}
