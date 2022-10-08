import java.util.*;

public class Pokemon {
    public int solution(int[] nums) {
        List<Integer> num2 = new ArrayList<Integer>();
        int arraynum = nums.length / 2;

        for (int num : nums) {
            if (num2.indexOf(num) < 0) {
                num2.add(num);
            }
        }

        if (num2.size() <= arraynum)
            return num2.size();
        else
            return arraynum;
    }

    public static void main(String[] args) {
        Pokemon p = new Pokemon();
        int[] nums = { 3, 1, 2, 3 };
        System.out.println(p.solution(nums));
        int[] nums2 = { 3, 3, 3, 2, 2, 4 };
        System.out.println(p.solution(nums2));
        int[] nums3 = { 3, 3, 3, 2, 2, 2 };
        System.out.println(p.solution(nums3));
    }
}