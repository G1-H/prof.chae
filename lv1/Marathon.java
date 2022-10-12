import java.util.*;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length - 1; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1];
    }

    public static void main(String[] args) {
        Marathon m = new Marathon();
        String[] p = { "leo", "kiki", "eden" };
        String[] c = { "eden", "kiki" };
        System.out.println(m.solution(p, c));
        String[] p1 = { "marina", "josipa", "nikola", "vinko", "filipa" };
        String[] c1 = { "josipa", "filipa", "marina", "nikola" };
        System.out.println(m.solution(p1, c1));
        String[] p2 = { "mislav", "stanko", "mislav", "ana" };
        String[] c2 = { "stanko", "ana", "mislav" };
        System.out.println(m.solution(p2, c2));
    }
}
