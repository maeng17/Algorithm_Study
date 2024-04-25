class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n = i; n <= j; n++){
            
            String num = Integer.toString(n);
           
            for(int m = 0; m < num.length(); m++){
                if(num.charAt(m) == (char)(k + '0')){
                    answer++;
                }
            }
        }
        return answer;
    }
}
