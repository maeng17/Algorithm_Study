class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        
        for(int i=1; i<=10; i++){
            while(true){
                num *= i;
                if(num<=n){
                    answer = i;
                    break;
                } else{
                    break;
                }      
            }
        }
        return answer;
    }
}