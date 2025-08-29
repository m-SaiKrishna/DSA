public class AliceAndBobPlayingFlowerGame {
    public static void main(String[] args) {
        int n = 3, m = 2;
        System.out.println(canAliceWin(n, m));
    }

    
    public static long canAliceWin(int n, int m) {
        return (long) m * n / 2;
    
}
}
