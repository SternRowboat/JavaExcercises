package Basic;

public class Iteration {
    public static void main(String[] args) {
        int int1 = 3;
        boolean bool = false;
        Iteration(int1, bool);
    }

    private static void Iteration(int int1, boolean bool) {
        String[] result;
        for (int i = 0; i < 10; i++) {
            result = Conditionals2.TwoInts(int1, i, bool);
            System.out.println(result[1]);

        }
    }
}
