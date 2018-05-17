package Basic;

public class Arrays {
    public static void main(String[] args) {
        PassArray();
    }

    private static void PassArray() {
        String[] result;
        boolean bool = false;
        int[] myArr = new int[10];
        for (int i = 0; i < 10; i++){
            myArr[i] = i;
        }
        for (int i = 0; i < myArr.length; i += 2) {
            result = Conditionals2.TwoInts(myArr[i], myArr[i + 1], bool);
            System.out.println(result[1]);
        }
    }
}