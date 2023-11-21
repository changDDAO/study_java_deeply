package comp_and_iter;

import java.util.Arrays;
import java.util.Comparator;

public class IntDescComparator {
    public static void main(String[] args) {
        Integer[] nums = {1, 6, 4, 2, 9, 1, 3, 7};
        Arrays.sort(nums, new IntDescComp());
        for (Integer num : nums) {
            System.out.print("num = " + num+" ");
        }
    }
    static class IntDescComp implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }

}
