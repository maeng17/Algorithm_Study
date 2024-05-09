class Solution {
    public int solution(int chicken) {
        int answer =0;
        int service = 0;
        int coupon = 0;
        while(chicken >=10){
            service = chicken / 10;
            coupon = chicken % 10;
            chicken = service + coupon;
            answer += service;
        }
        
        
        return answer;
    }
}