package Other.MinimumCoins;
import java.util.Arrays;
import java.util.Collections;

public class FindMin {
    public FindMin(Integer[] coins, int target) {
        Arrays.sort( coins, Collections.reverseOrder());
        int current = target;
//        int test = target%10;
//        Integer[] testMod = new Integer[coins.length];
//        for (int i = 0; i <coins.length ; i++) {
//            testMod[i] = coins[i]%10;
//        }

        System.out.println("Target is " + target + " individual pennies");
        int[] numCoins = new int[coins.length];

        for (int i = 0; i <coins.length ; i++) {
            while (current>=coins[i]){
                current -= coins[i];
                numCoins[i]++;

            }
            System.out.println(numCoins[i] + " " + coins[i] + "p's");

        }
        if (current!=0){
            System.out.println("There is a remainder of " + current +
            " have better coins George.");
        }


    }
    public FindMin(String[] coins, int target) {
        new FindMin( Filter.filterMe(coins ),target);
    }
}
