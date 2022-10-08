import java.util.*;

public class DartGame {
    public int solution(String dartResult) {
        int answer = 0;
        int index = 0;
        int[] result = new int[3];
        for (int i = 0; i < dartResult.length(); i++) {
            switch (dartResult.charAt(i)) {
                case 'S':
                    result[index] = (int) Math.pow(answer, 1);
                    index++;
                    break;
                case 'D':
                    result[index] = (int) Math.pow(answer, 2);
                    index++;
                    break;
                case 'T':
                    result[index] = (int) Math.pow(answer, 3);
                    index++;
                    break;
                case '*':
                    result[index - 1] *= 2;
                    if (index > 1)
                        result[index - 2] *= 2;
                    break;
                case '#':
                    result[index - 1] *= (-1);
                    break;
                case '1':
                    if (dartResult.charAt(i + 1) == '0') {
                        answer = 10;
                        i++;
                    } else
                        answer = 1;
                    break;
                default:
                    answer = Integer.valueOf(dartResult.charAt(i) - 48);
            }
        }
        return Arrays.stream(result).sum();
    }

    public static void main(String[] args) {
        DartGame d = new DartGame();
        System.out.println(d.solution("1S2D*3T"));
        System.out.println(d.solution("1D2S#10S"));
        System.out.println(d.solution("1D2S0T"));
        System.out.println(d.solution("1S*2T*3S"));
        System.out.println(d.solution("1D#2S*3S"));
        System.out.println(d.solution("1T2D3D#"));
        System.out.println(d.solution("1D2S3T*"));
    }

}
