import java.util.*;

public class WantOtherNum {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> temp_arr = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                temp_arr.add(arr[i]);

            } else {
                if (arr[i - 1] != arr[i]) {
                    temp_arr.add(arr[i]);
                }
            }
        }
        return temp_arr;
    }

    public static void main(String[] args) {
        WantOtherNum w = new WantOtherNum();
        int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
        System.out.println(w.solution(arr));

        int[] arr2 = { 4, 4, 4, 3, 3 };
        System.out.println(w.solution(arr2));
    }
}
