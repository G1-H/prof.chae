import java.util.Arrays;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String result = "";
            String binary1 = "";
            String binary2 = "";
            binary1 = Integer.toBinaryString(arr1[i]);
            binary2 = Integer.toBinaryString(arr2[i]);
            if (binary1.length() != n) {
                while (true) {
                    binary1 = "0" + binary1;
                    if (binary1.length() == n)
                        break;
                }
            }
            if (binary2.length() != n) {
                while (true) {
                    binary2 = "0" + binary2;
                    if (binary2.length() == n)
                        break;
                }
            }
            for (int j = 0; j < n; j++) {
                if (binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
                    result = result + "#";
                } else {
                    result = result + " ";
                }
            }
            answer[i] = result;
        }

        return answer;
    }

    public static void main(String[] args) {
        SecretMap s = new SecretMap();
        int[] arr1 = { 9, 20, 28, 18, 11 };
        int[] arr2 = { 30, 1, 21, 17, 28 };
        System.out.println(Arrays.toString(s.solution(5, arr1, arr2)));
    }
}
