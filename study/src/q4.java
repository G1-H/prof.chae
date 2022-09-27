import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arrNum = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        int i;
        for(i=0; i<arrNum.length; i++){
            answer += arrNum[i];
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}