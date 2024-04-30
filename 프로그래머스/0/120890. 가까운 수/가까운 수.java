class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int result = 100;
        
        for(int i=0; i<array.length; i++){
            int a = Math.abs(array[i]-n);
            if(a < result){
                result = a;
                answer = array[i];
            } else if(a == result) {
                answer = Math.min(answer, array[i]);
            }
        }
        return answer;
    }
}