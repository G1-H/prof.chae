import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int i;
        int a;
        int b;
        int m = sizes.length;
        int[][] nn = new int[m][m];
        for(i=0; i<sizes.length; i++){
            if(sizes[i][0] >= sizes[i][1]) {
                nn[i][0] = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = nn[i][0];
            }
        }
        Arrays.sort(sizes, Comparator.comparingInt((int[] o) -> o[0]));
        a = sizes[m-1][0];
        Arrays.sort(sizes, Comparator.comparingInt((int[] o) -> o[1]));
        b = sizes[m-1][1];
        answer = a*b;
        return answer;
    }
}