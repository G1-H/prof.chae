import java.util.ArrayList;

public class IslandTrip {
    public ArrayList<Integer> solution(String[] maps) {
        char[][] map = new char[maps.length][maps[0].length()];
        boolean[][] mapenter = new boolean[maps.length][maps[0].length()];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int cnt = 0;

        for (int i = 0; i < maps.length; i++) {
            map[i] = maps[i].toCharArray();
        }

        // while (true) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                int val = 0;
                if (map[i][j] != 'X') {
                    val = map[i][j] - '0';
                    mapenter[i][j] = true;
                    System.out.println(j);
                    cnt += val;
                } else {
                    mapenter[i][j] = false;
                }
            }
        }
        if (cnt == 0) {
            list.add(-1);
            // break;
        } else {
            list.add(cnt);
        }
        // break;
        // }
        return list;

    }

    public static void main(String[] args) {
        IslandTrip is = new IslandTrip();
        String[] s = { "X591X", "X1X5X", "X231X", "1XXX1" };
        System.out.println(is.solution(s));
        String[] s2 = { "XXXXX", "XXXXX", "XXXXX", "XXXXX" };
        System.out.println(is.solution(s2));

    }
}
