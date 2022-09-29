class Solution {
    public int solution(int n) {
        int answer = 0;
        int i;
        for(i=2; i<n; i++){
            int a = (n-1)%i;
            if(a == 0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}