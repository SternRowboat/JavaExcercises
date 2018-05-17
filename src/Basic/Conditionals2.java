package Basic;

public class Conditionals2 {
    public static void main(String[] args) {
        //true is addition, false multiply. [1] is verbose, [0] is not.
        System.out.println(TwoInts(4,0, true)[1]);
    }

    public static String[] TwoInts(int int1, int int2, boolean bool) {
        String[] result = new String[2];
        if (int1 == 0) {
            result[1] = ("int1 was 0, printing int2 :\n " + int2);
            return result;
        } else if (int2 == 0) {
            result[1] = ("int2 was 0, printing int1 :\n " + int1);
            return result;
        }
        result = Conditionals.TwoInts(int1, int2, bool);
        return result;
    }
}