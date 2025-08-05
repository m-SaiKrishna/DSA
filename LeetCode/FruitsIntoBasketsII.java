public class FruitsIntoBasketsII {
    public static void main(String[] args) {
        int[] fruits = {3,5,4};
        int[] baskets = {4,2,5};
        System.out.println(numOfUnplacedFruits(fruits, baskets));
    }
        public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt = 0;
        for(int i = 0; i < fruits.length; i++){
            for(int j = 0; j < baskets.length; j++){
                if(baskets[j] >= fruits[i]) {
                baskets[j] = -1;
                break;
                }
               
            }
        }

        for(int i = 0; i < baskets.length; i++){
            if(baskets[i] != -1) cnt++;
        }
        return cnt;
    }
}
