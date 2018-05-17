package Basic;

public class IterationArrays {
    public static void main(String[] args) {
        int[] myArr = new int[10];
        for (int i = 0; i < 10; i++){
            myArr[i] = i+1;
            System.out.print(myArr[i]+",");
        }
        System.out.print("\n");
        for (int i = 0; i < 10; i++){
            System.out.print((myArr[i]*10)+",");
        }
    }
}
