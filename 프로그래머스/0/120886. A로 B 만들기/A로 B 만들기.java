import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        before = String.valueOf(beforeArr);
        after = String.valueOf(afterArr);
        
        if(before.equals(after)) answer = 1;
        else answer = 0;
        
        return answer;
    }
}