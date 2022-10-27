import java.util.ArrayList;

public class MockTest {
    public ArrayList<Integer> solution(int[] answers) {
        int[] answer = new int[3];
        int[] member1 = { 1, 2, 3, 4, 5 };
        int[] member2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] member3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        for (int i = 0; i < answers.length; i++) {
            if ((member1[i % member1.length] == answers[i]))
                answer[0]++;
            if ((member2[i % member2.length] == answers[i]))
                answer[1]++;
            if ((member3[i % member3.length] == answers[i]))
                answer[2]++;
        }

        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (max == answer[0])
            list.add(1);
        if (max == answer[1])
            list.add(2);
        if (max == answer[2])
            list.add(3);

        return list;

    }

    public static void main(String[] args) {
        MockTest mt = new MockTest();
        int[] answers = { 1, 2, 3, 4, 5 };
        System.out.println(mt.solution(answers));
        int[] answers1 = { 1, 3, 2, 4, 2 };
        System.out.println(mt.solution(answers1));
    }
}
