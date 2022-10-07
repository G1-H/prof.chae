import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int a;
        int b = (lost.length > reserve.length) ? reserve.length : lost.length;
        for(int i = 0; i<lost.length; i++){
            for(int j = 0; j<reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    int[] result = new int[reserve.length - 1];
                    System.arraycopy(result, 0, result, 0, i);
                    if (reserve.length != i) {
                        System.arraycopy(reserve, i + 1, result, i, reserve.length - i - 1);
                    }
                }
            }
        }
        for(int i = 0; i<lost.length; i++){
            a = Arrays.asList(reserve).indexOf(lost[i]+1);
            if(a != -1){
                int[] result = new int[lost.length - 1];
                System.arraycopy(lost, 0, result, 0, i);
                if (lost.length != i) {
                    System.arraycopy(lost, i + 1, result, i, lost.length - i - 1);
                }
                int[] result2 = new int[reserve.length - 1];
                System.arraycopy(reserve, 0, result2, 0, a);
                if (reserve.length != a) {
                    System.arraycopy(reserve, a + 1, result2, a, reserve.length - a - 1);
                }

            }
        }
        for(int i = 0; i<lost.length; i++){
            a = Arrays.asList(reserve).indexOf(lost[i]-1);
            if(a != -1){
                int[] result = new int[lost.length - 1];
                System.arraycopy(lost, 0, result, 0, i);
                if (lost.length != i) {
                    System.arraycopy(lost, i + 1, result, i, lost.length - i - 1);
                }
                int[] result2 = new int[reserve.length - 1];
                System.arraycopy(reserve, 0, result2, 0, a);
                if (reserve.length != a) {
                    System.arraycopy(reserve, a + 1, result2, a, reserve.length - a - 1);
                }
            }
        }
        answer = n - lost.length;
        return answer;
    }
}