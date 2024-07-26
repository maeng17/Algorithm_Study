class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String startS = my_string.substring(0, s);
        String endS = my_string.substring(overwrite_string.length()+s);
        answer = startS + overwrite_string + endS;
        return answer;
    }
}