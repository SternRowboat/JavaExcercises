package Other.MinimumCoins;

public class Main {
    public static void main(String[] args) {
        Integer[] coins = {50,5,1,20};
        String[] coins2 = {"£1", "50p", "£2","20p","5p","1p"};
        int target = 73;
        FindMin find = new FindMin(coins2, target);

    }
}
