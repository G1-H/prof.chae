public class Phone {
    public String solution(String phone_number) {
        return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
    }
    // return phone_number.replaceAll(".(?=.{4})", "*"); - 정규식이랭.. 아는사람 있놤 난 어렵따

    public static void main(String[] args) {
        Phone p = new Phone();

        System.out.println(p.solution("01033334444"));
        System.out.println(p.solution("027778888"));
    }
}
