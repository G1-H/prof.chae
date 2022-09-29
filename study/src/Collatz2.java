class Solution {
    public int solution(int num) {
        int answer = 0;
        int ans = num;
        int i;
        if(num==1){
            answer = 0;
        }
        else{
            for(i=0; i<500; i++){
                if(ans==1){
                    answer = i;
                    break;
                }
                else if(ans%2==0){
                    ans = ans/2;
                }
                else if(ans%2 == 1){
                    ans = ans*3+1;
                }
            }
            if(i<500) {
                answer = i;
            }
            else{
                answer = -1;
            }
        }
        return answer;
    }
}