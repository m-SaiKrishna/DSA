import java.util.*;

public class MaximumMatchingOfPlayersWithTrainers {
   

    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int m = players.length;
        int n = trainers.length;
        int count = 0;

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (players[i] <= trainers[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]pla = new int[n];
        int[]tra = new int[m];
        for(int i=0; i<pla.length; i++){
            pla[i] = sc.nextInt();
        }
        for(int i=0; i<tra.length; i++){
            tra[i] = sc.nextInt();
        }
        int ans = matchPlayersAndTrainers(pla,tra);
        System.out.println(ans);
    }
}

