package Intermediate;

import java.util.Arrays;

public class UniqueSum {
    public static void main(String[] args) {
        int[] nums = new int[]{41,23,58};
        UniqueSum(nums);
    }
    private static void UniqueSum(int[] nums){
        int sum = Arrays.stream(nums).distinct().sum();
        System.out.println(sum);
    }
}
