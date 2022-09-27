class Solution {
    public long solution(long n) {
        long answer = 0;
        long x;
        for(x=1; x<=n; x++){
            answer = -1;
            if(x*x==n){
                answer = (x+1)*(x+1);
                break;
            }
        }
        return answer;
    }
}