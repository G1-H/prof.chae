import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReportResult {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Set<String> reportresult = new HashSet<String>();
        reportresult.addAll(Arrays.asList(report));

        List<String> reporter = new ArrayList<String>();
        List<String> reported = new ArrayList<String>();

        for (String r : reportresult) {
            int index = r.indexOf(" ");
            reporter.add(r.substring(0, index));
            reported.add(r.substring(index, r.length()));
        }

        for (int i = 0; i < reported.size(); i++) {
            if (Collections.frequency(reported, reported.get(i)) >= k) {
                int index2 = Arrays.asList(id_list).indexOf(reporter.get(i));
                answer[index2]++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ReportResult rp = new ReportResult();
        String[] id_list = { "muzi", "frodo", "apeach", "neo" };
        String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
        rp.solution(id_list, report, 2);

        String[] id_list2 = { "con", "ryan" };
        String[] report2 = { "ryan con", "ryan con", "ryan con", "ryan con" };
        rp.solution(id_list2, report2, 3);
    }
}
