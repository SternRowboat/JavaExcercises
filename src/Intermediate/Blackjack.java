package Intermediate;

public class Blackjack {
    public static void main(String[] args) {
        int dealer = 23;
        int player1 = 15;
        System.out.println(PlayBlackjack(dealer, player1));
    }

    private static String PlayBlackjack(int dealer, int player1) {
        //if both hands are above 0 AND either player has a hand below 22
        if ((dealer > 0 && player1 > 0) && (player1 <= 21 || dealer <=21)) {
            //play. Dealer wins if higher than player 1. OR player 1 is bust.
            if ((dealer <=21 && player1<=21 && dealer > player1) || player1>21) {
                return ("Dealer wins with " + dealer + ".");
            } else {
                return ("Player 1 wins with " + player1 + ".");
            }
        } else if ((dealer > 21 && player1 > 21)) {
            // both bust
            return ("You're both bust");
        } else {
            //error
            return ("Error, try using a real blackjack hand.");
        }
    }
}