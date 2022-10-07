import java.util.ArrayList;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] arr = new int[3];
        String a = "";
        int b = 0;

        for(int i=0; i<dartResult.length(); i++){
            switch(dartResult.charAt(i)){
                case'S' :
                    arr[b] = (int)Math.pow(Integer.parseInt(a), 1);
                    b++;
                    a = "";
                    break;

                case'D' :
                    arr[b] = (int) Math.pow(Integer.parseInt(a), 2);
                    b++;
                    a = "";
                    break;

                case'T' :
                    arr[b] = (int)Math.pow(Integer.parseInt(a), 3);
                    b++;
                    a = "";
                    break;
                case'*':
                    arr[b-1] *= 2;
                    if(b>1){
                        arr[b-2] *= 2;
                    }
                    break;
                case'#':
                    arr[b-1] *= -1;
                    break;
                default:
                    a += String.valueOf(dartResult.charAt(i));
                    break;
            }
        }

        for(int i = 0; i<arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}