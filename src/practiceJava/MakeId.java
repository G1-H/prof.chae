package practiceJava;

public class MakeId {
	public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        char [] chars = answer.toCharArray();
        char a = 0;
        int k = 0;
        for (char c: chars) {
        	if(c!='.') {
        		chars[k++]=c;
        		a=c;
        	}else {
        		if (a != c){
            		chars[k++]=c;
            		a = c;
            	}
        	}
        	
        	answer =  new  String(chars).substring(0,k);
        	
        }
      
        
       
        int b = answer.lastIndexOf(".");
        if(b==answer.length()-1) {
        	answer = answer.substring(0,answer.length()-1);
        }
        
        b = answer.indexOf(".");
        if(b ==0) {
        	answer = answer.substring(1,answer.length());
        }
        
        answer = answer.isEmpty()?"a":answer;
        
        if(answer.length()>=16) {
        	answer = answer.substring(0,15);
        	b = answer.lastIndexOf(".");
            if(b==answer.length()-1) {
            	answer = answer.substring(0,answer.length()-1);
            }
        }
        
        if(answer.length()<=2) {
        	for(int i=answer.length(); i <3 ;i++) {
        		answer += answer.substring(answer.length()-1,answer.length());
        		
        	}
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		MakeId mi = new MakeId();
		System.out.println(mi.solution("akKKDf@_2194!@#$$!............"));
		
	}
}
