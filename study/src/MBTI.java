class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int a = 0;
        for(int i = 0; i<survey.length; i++){
            String temp = survey[i];
            if(temp == "rt" || temp == "tr"){
                if(temp == "rt"){
                    a += 4 - choices[i];
                }
                else{
                    a += choices[i] - 4;
                }
                if(a>=0){
                    answer += "R";
                }
                else{
                    answer += "T";
                }
            } else if (temp == "cf" || temp == "fc") {
                a = 0;
                if(temp == "cf"){
                    a += 4 - choices[i];
                }
                else{
                    a += choices[i] - 4;
                }
                if(a>=0){
                    answer += "C";
                }
                else{
                    answer += "F";
                }

            } else if (temp == "jm" || temp == "mj") {
                a = 0;
                if(temp == "jm"){
                    a += 4 - choices[i];
                }
                else{
                    a += choices[i] - 4;
                }
                if(a>=0){
                    answer += "J";
                }
                else{
                    answer += "M";
                }

            } else if (temp == "an" || temp == "na") {
                a = 0;
                if(temp == "an"){
                    a += 4 - choices[i];
                }
                else{
                    a += choices[i] - 4;
                }
                if(a>=0){
                    answer += "A";
                }
                else{
                    answer += "N";
                }

            }
        }
        return answer;
    }
}