package Intermediate;

public class TooHot {
    public static void main(String[] args) {
        int temp = 59;
        boolean isSummer = false;
        if(TooHot(temp,isSummer)){
            System.out.println("It's too hot!");
        } else {
            System.out.println("It's not that hot.");
        }

    }
    private static boolean TooHot(int temp,boolean isSummer) {
        int upperLimit = 90;
        int lowerLimit = 60;
        if (isSummer){
            upperLimit = 100;
        }
        if (temp>=lowerLimit && temp<=upperLimit){
            return true;
        }
        return false;
    }

}
