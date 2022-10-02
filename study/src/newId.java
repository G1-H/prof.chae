class Solution {
    public String solution(String new_id) {
        String answer = "";
        String s;
        s = new_id.toLowerCase();
        s = s.replaceAll("[^\\w-_.]", "");
        s = s.replaceAll("[.]+", ".");
        if (s.startsWith(".")) {
            s = s.substring(1);
        }
        if (s.endsWith(".")) {
            s = s.substring(0, s.length() - 1);
        }
        if (s == "") s += "a";
        if (s.length() >= 16) s = s.substring(0, 15);
        if (s.endsWith(".")) {
            s = s.substring(0, s.length() - 1);
        }
        if (s.length() < 3) {
            while (s.length() < 3) {
                s += s.charAt(s.length()-1);
            }
        }
        answer = s;
        return answer;
    }
}