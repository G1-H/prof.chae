import java.util.*;

public class Jinwoomap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String bi1[] = new String[n];
        String bi2[] = new String[n];

        for (int i = 0; i < n; i++) {
            bi1[i] = Integer.toBinaryString(arr1[i]);
        }
        System.out.println(Arrays.toString(bi1));
        for (int i = 0; i < n; i++) {
            bi2[i] = Integer.toBinaryString(arr2[i]);
        }
        System.out.println(Arrays.toString(bi2));
        for (int i = 0; i < n; i++) {
            String a = null;
            for (int j = 0; j < n; j++) {
                if (bi1[i].charAt(j) == '0' && bi2[i].charAt(j) == '0') {
                    a += " ";
                } else
                    a += "#";
            }
            answer[i] = a;
        }
        return answer;
    }

    public static void main(String[] args) {
        Jinwoomap s = new Jinwoomap();
        int[] arr1 = { 9, 20, 28, 18, 11 };
        int[] arr2 = { 30, 1, 21, 17, 28 };
        System.out.println(Arrays.toString(s.solution(5, arr1, arr2)));
    }
}
