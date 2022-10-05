import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            ans.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i).substring(1, ans.get(i).length());
        }
        return answer;
    }
}