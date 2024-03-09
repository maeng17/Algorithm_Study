class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] num = my_string.replaceAll("[^0-9]", "").split("");
        for(String i : num){
            answer += Integer.parseInt(i);
        }
        return answer;
    }
}