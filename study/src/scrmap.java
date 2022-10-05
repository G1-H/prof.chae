class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String bi1[] = new String[n];
        String bi2[] = new String[n];

        for(int i = 0; i<n; i++){
            bi1[i] = Integer.toBinaryString(arr1[i]);
            if(bi1[i].length()<n){
                while(bi1[i].length() != n){
                    bi1[i] = "0"+bi1[i];
                }

            }
        }
        System.out.println(bi1);
        for(int i = 0; i<n; i++){
            bi2[i] = Integer.toBinaryString(arr2[i]);
            if(bi2[i].length()<n){
                while(bi2[i].length() != n){
                    bi2[i] = "0"+bi2[i];
                }

            }
        }
        for(int i = 0; i<n; i++) {
            String a = "";
                for(int j=0; j<n; j++){
                    if(bi1[i].charAt(j)=='0' && bi2[i].charAt(j)=='0'){
                        a+= " ";
                    }
                    else a+= "#";
            }
                answer[i] = a;
        }
        return answer;
    }
}