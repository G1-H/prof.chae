class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int i;
        int a;
        int sum = 0;
        for(i = 0; i<numbers.length; i++){
            for(a=0; a<=9; a++){
                if(a == numbers[i]){
                    sum += a;
                }
            }
        }
        answer = 45 - sum;
        return answer;
    }
}