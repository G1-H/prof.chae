import java.util.*;

public class WorkoutC {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        int count = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == lost[i]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    count++;
                    break;
                }
            }
        }
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }

        return answer + count;

    }

    public int solution2(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost)
            people[l - 1]--;
        for (int r : reserve)
            people[r - 1]++;

        for (int i = 0; i < people.length; i++) {
            if (people[i] == -1) {
                if (i - 1 >= 0 && people[i - 1] == 1) {
                    people[i]++;
                    people[i - 1]--;
                } else if (i + 1 < people.length && people[i + 1] == 1) {
                    people[i]++;
                    people[i + 1]--;
                } else
                    answer--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        WorkoutC w = new WorkoutC();
        int[] lost = { 2, 4 };
        int[] reserve = { 1, 3, 5 };
        System.out.println(w.solution(5, lost, reserve));
        System.out.println(w.solution2(5, lost, reserve));
        int[] lost2 = { 2, 4 };
        int[] reserve2 = { 3 };
        System.out.println(w.solution(5, lost2, reserve2));
        System.out.println(w.solution2(5, lost2, reserve2));
        int[] lost3 = { 3 };
        int[] reserve3 = { 1 };
        System.out.println(w.solution(3, lost3, reserve3));
        System.out.println(w.solution2(5, lost3, reserve3));
        int[] lost4 = { 1, 2, 5, 6, 10, 12, 13 };
        int[] reserve4 = { 2, 3, 4, 5, 7, 8, 9, 10, 11, 12 };
        System.out.println(w.solution(13, lost4, reserve4));
        System.out.println(w.solution2(5, lost4, reserve4));
    }
}