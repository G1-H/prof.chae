import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> par = new ArrayList<String>(Arrays.asList(participant));
        List<String> com = new ArrayList<String>(Arrays.asList(completion));
        ArrayList resultList = new ArrayList<String>();
        for(int i = 0; i<participant.length; i++){
            if(par.contains(com.get(i))){
                par.remove(com.get(i));
                resultList.add(participant[i]);
            }
            if(i == participant.length - 1){
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Object item : resultList){
            sb.append(item);
            sb.append(",");
        }
        answer = sb.toString();
        return answer;
    }
}