import java.util.Arrays;

public class Matrix {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int x = arr1.length;
        int y = arr1[0].length;
        int[][] answer = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
                System.out.println(arr1[i][j] + " " + arr2[i][j]);
            }
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] arr1 = { { 1, 2 }, { 2, 3 } };
        int[][] arr2 = { { 3, 4 }, { 5, 6 } };
        System.out.println(m.solution(arr1, arr2));
    }
}
