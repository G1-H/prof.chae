class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt = 0;
        int z = 0;
        for(int lotto: lottos){
            if(lotto == 0) {
                z ++;
                continue;
            }
            for(int win_num:win_nums){
                if(win_num == lotto){
                    cnt ++;
                    break;
                }
            }
        }
        return new int[]{7-Math.max(cnt+z,1),7-Math.max(cnt,1)};
    }
}