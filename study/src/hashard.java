import java.util.stream.Stream;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int a = 0;
        int[] arrNum = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
        int i;
        for(i=0; i<arrNum.length; i++){
            a += arrNum[i];
        }
        if(x%a != 0) answer = false;
        return answer;
    }
}