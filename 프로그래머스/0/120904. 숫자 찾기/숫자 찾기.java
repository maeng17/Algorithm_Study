import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
         
        ArrayList<Integer> arr = new ArrayList<>();
        while(num>0){
            arr.add(0, num%10);
            num /= 10;
        }
        
        answer = -1;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == k) {
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}