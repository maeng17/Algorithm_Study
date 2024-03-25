class Solution {
    public String solution(int age) {
        String answer = "";
        String age_s = String.valueOf(age);
        for(int i=0; i<age_s.length(); i++){
            answer += (char) (age_s.charAt(i) + 49);
        }
        return answer;
    }
}