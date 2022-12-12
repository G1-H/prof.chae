import java.util.ArrayList;
import java.util.List;

//시간초과
class Solution {
    public static int solution(int[] ingredient) {
        List<Integer> intlist = new ArrayList<>();
        int answer = 0;

        for (int i = 0; i < ingredient.length; i++) {
            intlist.add(ingredient[i]);
            int size = intlist.size();
            if (size >= 4) {
                if (intlist.get(size - 4) == 1 && intlist.get(size - 3) == 2
                        && intlist.get(size - 2) == 3 & intlist.get(size - 1) == 1) {
                    answer++;
                    intlist.subList(size - 4, size).clear();
                }
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        int[] ingredeint = { 2, 1, 1, 2, 3, 1, 2, 3, 1 };
        System.out.println("1 : " + solution(ingredeint));

        int[] ingredeint2 = { 1, 3, 2, 1, 2, 1, 3, 1, 2 };
        System.out.println("2 : " + solution(ingredeint2));
    }
}