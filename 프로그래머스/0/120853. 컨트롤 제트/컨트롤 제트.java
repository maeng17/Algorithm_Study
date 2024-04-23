import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Z")) {
                if (i > 0) {
                    int num = Integer.parseInt(list.get(i-1));
                    answer -= num;
                }
            } else {
                answer += Integer.parseInt(list.get(i)); 
            }
        }
        
        return answer;
    }
}
