class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a = countChar(s, 'p');
        int b = countChar(s, 'y');
        int c = countChar(s, 'P');
        int d = countChar(s, 'Y');
        if(a+c != b+d) answer = false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
    public static int countChar(String str, char ch)
    {int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}