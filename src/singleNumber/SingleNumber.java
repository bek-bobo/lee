package singleNumber;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,1,7,7};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int box= 0;
        for (int num : nums) {
            box ^= num;
        }
        return box;
    }
}
