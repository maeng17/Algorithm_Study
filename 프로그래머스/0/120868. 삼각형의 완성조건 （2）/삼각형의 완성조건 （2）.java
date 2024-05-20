import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        int min = sides[1] - sides[0];
        int max = sides[1] + sides[0];
        
        //case 1
        for(int i=min+1; i<sides[1]+1; i++){
            answer++;
        }
        
        //case 2
        for(int i=sides[1]+1; i<max; i++){
            answer++;
        }
        
        return answer;
    }
}