class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....",
                          "..",".---","-.-",".-..","--","-.","---",".--.","--.-",
                          ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] list = letter.split(" ");
        
        for(int i=0; i<list.length; i++){
            for(int j=0; j<morse.length; j++){
                if(morse[j].equals(list[i])){
                    answer += (char)(j+97);
                }
            }
        }
        return answer;
    }
}