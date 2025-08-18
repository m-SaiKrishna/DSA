public class Maximum69Number {
     public static int maximum69Number (int num) {
        char [] arr = String.valueOf(num).toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '6'){
            arr[i] = '9';
            break;
            }
        }
        return Integer.parseInt(new String(arr));
    }

    public static void main(String[] args) {
        int n = 9969;
        //   int n = 9969;
        System.out.println(maximum69Number(n));
    }
}
