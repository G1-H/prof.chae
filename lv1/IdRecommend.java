public class IdRecommend {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        new_id = new_id.replaceAll("[.]{2,}", ".");
        new_id = new_id.replaceAll("^(\\.)|(\\.)$", "");
        new_id = (new_id.isEmpty()) ? "a" : new_id;
        new_id = (new_id.length() >= 16) ? new_id.substring(0, 15).replaceAll("(\\.)$", "") : new_id;

        new_id = (new_id.length() <= 2)
                ? new_id.concat(new_id.substring(new_id.length() - 1, new_id.length()).repeat(3 - new_id.length()))
                : new_id;
        return new_id;
    }

    public static void main(String[] args) {
        IdRecommend i = new IdRecommend();

        System.out.println(i.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(i.solution("z-+.^."));
        System.out.println(i.solution("=.="));
        System.out.println(i.solution("123_.def"));
        System.out.println(i.solution("abcdefghijklmn.p"));

    }
}
