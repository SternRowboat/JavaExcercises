package Other.Rekt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name = "Dale";
        int len = name.length();
        String[] nameArr = new String[len];
        for (int i = 0; i <len ; i++) {
            nameArr[i]= name.substring(i,i+1);
        }
//        for (String name1: nameArr){
//            System.out.println(name1);
//        }
        int height = 2;
        int width = 2;
        String[][] grid = new String[len+((len-1)*width)][len+((len-1)*height)];
        for (int i = 0; i <(len-1) ; i++) {
//            System.out.print(nameArr[i] + i + j);
            for (int j=0; j <=(height*(len-1)) ; j+=(len-1)) {
                grid[i][j]=nameArr[i];
                for (int k=0;k<)
                System.out.println(grid[i][j]);
//                if(j==2){
//                    System.out.println(" ");
//                }
            }
        }

////        Rekt coolThing = new Rekt();
//        coolThing.drawMe()
//        for (int i = 0; i < 10 ; i++) {
//
//        }
        System.out.println(Arrays.deepToString(grid));
    }
}
