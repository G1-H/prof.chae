public class avg {
    public double solution(int[] arr) {
        double sum = 0;
        if (arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(arr[i]);
        }
        return sum / (double) arr.length;

    }

    // int answer = (int) Arrays.stream(array).avearge().orElse(0); return answer;
    // average()는 평균을 구하는 메소드고, orElse(double other)은 average의 값이 있으면 average를 리턴하고
    // 값이 없으면other을 리턴하는 메소드
    // return Arrays.stream(arr).average().getAsDouble();
    public static void main(String[] args) {
        avg a = new avg();
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(a.solution(arr));
        int[] arr2 = { 5, 5 };
        System.out.println(a.solution(arr2));
    }
}
