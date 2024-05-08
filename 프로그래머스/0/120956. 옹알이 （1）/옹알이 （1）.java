class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        for(int j=0; j<babbling.length; j++) {
            for(int i=0; i<str.length; i++){
                babbling[j] = babbling[j].replace(str[i], " ");
            }
            if(babbling[j].replaceAll(" ", "").equals("")) answer++;
            
        }
        return answer;
    }
}