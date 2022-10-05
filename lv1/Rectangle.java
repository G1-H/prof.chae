public class Rectangle {
    public int solution(int[][] sizes) {
        int[] max = new int[sizes.length];
        int[] min = new int[sizes.length];
        int maxnum, minnum;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] >= sizes[i][1]) {
                max[i] = sizes[i][0];
                min[i] = sizes[i][1];
            } else {
                max[i] = sizes[i][1];
                min[i] = sizes[i][0];
            }
        }

        maxnum = max[0];
        minnum = min[0];
        for (int j = 1; j < sizes.length; j++) {
            if (maxnum < max[j])
                maxnum = max[j];
            if (minnum < min[j])
                minnum = min[j];
        }

        return maxnum * minnum;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
        System.out.println(r.solution(sizes));
        int[][] sizes2 = { { 10, 7 }, { 12, 3 }, { 8, 15 }, { 14, 7 }, { 5, 15 } };
        System.out.println(r.solution(sizes2));
    }
}
