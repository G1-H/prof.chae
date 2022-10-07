import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length/2;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(arr.contains(nums[i])) continue;
            else arr.add(nums[i]);
        }
        if(arr.size()<=n) answer = arr.size();
        else answer = n;
        return answer;
    }
}