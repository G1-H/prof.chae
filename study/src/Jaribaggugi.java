import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(long n) {
        long num = n;
        int a = 0;

        while(num != 0){
            num /= 10;
            a++;
        }

        int[] answer = new int[a];

        num = n;
        for(int i = 0; num != 0; i++){
            answer[i] = (int)(num % 10);
            num /= 10;
        }

        return answer;

    }
}