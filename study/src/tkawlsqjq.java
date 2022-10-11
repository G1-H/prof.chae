class Solution {
    public int solution(int n) {
        int answer = 0;
        String ans;
        String rev = "";
        ans = Integer.toString(n,3);
        for(int i = ans.length()-1; i>=0; i--){
            rev = rev + ans.charAt(i);
        }
        answer = Integer.parseInt(rev, 3);
        return answer;
    }
}