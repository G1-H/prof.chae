class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] ar1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] ar2 = {"0","1","2","3","4","5","6","7","8","9"};
        for(int i = 0; i<10; i++){
            s = s.replace(ar1[i], ar2[i]);
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}