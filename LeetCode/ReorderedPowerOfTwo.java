import java.util.Arrays;

public class ReorderedPowerOfTwo {
    public static void main(String[] args) {
        int n = 23;
        System.out.println(reorderedPowerOf2(n));
    }

     public static boolean reorderedPowerOf2(int n) {
        String target = sortedString(n);
        for (int i = 0; i < 31; i++) {
            if (sortedString(1 << i).equals(target)) return true;
        }
        return false;
    }

    private static String sortedString(int x) {
        char[] arr = String.valueOf(x).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
