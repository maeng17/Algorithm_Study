class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for (String word : dic) {
            int count = 0;
            for (String s : spell) {
                if (word.contains(s)) count++;
            }
            if (count == spell.length) {
                answer = 1;
            } 
        }
        return answer;
    }
}