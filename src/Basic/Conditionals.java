package Basic;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println(TwoInts(10,15, false)[1]);
    }

    public static String[] TwoInts(int int1, int int2, boolean bool){
        String[] result = new String[2];
        if (bool) {
            result[0] = Integer.toString(int1 + int2);
            result[1] = (int1 + " + " + int2 + " = " + result[0]);
        }   else {
            result[0] = Integer.toString(int1 + int2);
            result[1] = (int1 + " + " + int2 + " = " + result[0]);
        }
        return result;
    }
}