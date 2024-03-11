class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderSt = Integer.toString(order);
        
        for(int i =0; i<orderSt.length(); i++){
            char ch = orderSt.charAt(i);
            
            if ( ch == '3' || ch == '6' || ch == '9')
                answer++;
        }
        return answer;
    }
}