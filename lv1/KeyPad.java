class KeyPad {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        int beforeLeft = 10;
        int beforeRight = 12;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0)
                numbers[i] = 11;
            int num = numbers[i];

            if (num % 3 == 1) {
                left = num;
                answer += "L";
            } else if (num % 3 == 0) {
                right = num;
                answer += "R";
            } else {
                beforeLeft = left;
                beforeRight = right;
                left = (Math.abs(num - left) % 3) + (Math.abs(num - left) / 3);
                right = (Math.abs(num - right) % 3) + (Math.abs(num - right) / 3);
                if (left > right) {
                    right = num;
                    left = beforeLeft;
                    answer += "R";
                } else if (left < right) {
                    left = num;
                    right = beforeRight;
                    answer += "L";
                } else {
                    if (hand.equals("left")) {
                        left = num;
                        right = beforeRight;
                        answer += "L";
                    } else {
                        right = num;
                        left = beforeLeft;
                        answer += "R";
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        KeyPad k = new KeyPad();
        int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
        System.out.println(k.solution(numbers, "right"));

        int[] numbers2 = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
        System.out.println(k.solution(numbers2, "left"));

        int[] numbers3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        System.out.println(k.solution(numbers3, "right"));
    }
}