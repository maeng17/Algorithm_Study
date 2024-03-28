class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int [numbers.length];
        int s;
        int c = 0;
        
        if(direction.equals("right")) {
           s = numbers[numbers.length-1];
            for(int i=numbers.length-2; i>=0; i--){
                numbers[i+1] = numbers[i];
            }
            numbers[0] = s;
        }
        else {
            s = numbers[0];
            for(int i=1; i<numbers.length; i++){
                numbers[i-1] = numbers[i];
            }
            numbers[numbers.length-1] = s;
        }
        for(int n : numbers){
            answer[c] = n;
            c++;
        }
        return answer;
    }
}