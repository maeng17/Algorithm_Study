class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        
        while(n > 0){
            if(num%3!=0 && !Integer.toString(num).contains("3")){
                answer = num;
                n--;
            }
            num++;
        }
        
        return answer;
    }
}