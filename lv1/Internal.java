class Internal {
    public int solution(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Internal i = new Internal();
        int a[] = { 1, 2, 3, 4 };
        int b[] = { -3, -1, 0, 2 };
        System.out.println(i.solution(a, b));

        int c[] = { -1, 0, 1 };
        int d[] = { 1, 0, -1 };
        System.out.println(i.solution(c, d));
    }
}