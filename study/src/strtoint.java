class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");
        if(arr[0] == "-"){
            String str = String.valueOf(arr);
            str = str.substring(1);
            answer = Integer.parseInt(str);
        }
        else{
            answer = Integer.parseInt(s);
        }

        return answer;
    }
}