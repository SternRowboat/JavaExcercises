package Other.MinimumCoins;

public class Filter {
    public static Integer[] filterMe(String[] coins) {
            Integer[] newCoins = new Integer[coins.length];
            for (int i = 0; i <coins.length ; i++) {
                if (coins[i].substring(0,1).equals( "£" )){
                    newCoins[i]=Integer.parseInt( coins[i].substring( 1 ))*100;
                } else if (coins[i].substring(coins[i].length()-1,coins[i].length()).equals( "p" )) {
                    newCoins[i]=Integer.parseInt( coins[i].substring(0, coins[i].length()-1 ));
                }  else {
                    newCoins[i]=Integer.parseInt(coins[i]);
                }
            }return newCoins;
    }
}
