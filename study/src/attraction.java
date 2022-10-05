class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        int i;
        long sum = 0;
        for(i = 1; i<=count; i++){
            sum += price*i;
        }
        if(money - sum >= 0)  answer=0;
        else answer = sum - money;
        return answer;
    }
}