package practiceJava;
import java.util.Arrays;
public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
       /* String[] win_nums2 = Arrays.stream(win_nums).mapToObj(String::valueOf).toArray(String[]::new);
        String[] lottos2 = Arrays.stream(lottos).mapToObj(String::valueOf).toArray(String[]::new);*/
      
        int dang = 0;
        int zero = 0;
        for(int i = 0 ; i <6 ; i++) {
        	if(lottos[i]==0) zero++;
        	for(int j = 0 ; j<6 ; j++) {
        		if(lottos[i]==win_nums[j]) {
        			dang++;
        		}
        	}	
     
        }
        int [] deung = {6, 6, 5, 4, 3, 2, 1};
       answer[0] = deung[dang+ zero];
       answer[1] = deung[dang];
        return answer;
    }
    
    public static void main(String[] args) {
    	Lotto l = new Lotto();
    	int[] a = {44, 1, 0, 0, 31, 25};
    	int[] b= {31, 10, 45, 1, 6, 19};
    	System.out.println(Arrays.toString(l.solution(a, b)));
    }

}
