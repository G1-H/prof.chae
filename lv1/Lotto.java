import java.util.Arrays;

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt = 0;
        int cntzero = 0;
        int base = 6;

        for (int lotto : lottos) {
            for (int num : win_nums) {
                if (lotto == num) {
                    cnt++;
                }
            }
            if (lotto == 0)
                cntzero++;
        }
        switch (cnt) {
            case 2:
                base = 5;
                break;
            case 3:
                base = 4;
                break;
            case 4:
                base = 3;
                break;
            case 5:
                base = 2;
                break;
            case 6:
                base = 1;
                break;
        }

        int win = base - cntzero;
        if (win <= 1)
            win = 1;
        int[] result = { win, base };
        return result;
    }

    public static void main(String[] args) {
        Lotto l = new Lotto();
        int[] lottos = { 44, 1, 0, 0, 31, 25 };
        int[] win_nums = { 31, 10, 45, 1, 6, 19 };
        System.out.println(Arrays.toString(l.solution(lottos, win_nums)));

        int[] lottos2 = { 0, 0, 0, 0, 0, 0 };
        int[] win_nums2 = { 38, 19, 20, 40, 15, 25 };
        System.out.println(Arrays.toString(l.solution(lottos2, win_nums2)));

        int[] lottos3 = { 45, 4, 35, 20, 3, 9 };
        int[] win_nums3 = { 20, 9, 3, 45, 4, 35 };
        System.out.println(Arrays.toString(l.solution(lottos3, win_nums3)));

    }
}
