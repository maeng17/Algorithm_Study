class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] tot = new int[score.length];
        
        for(int i=0; i<score.length; i++){
            tot[i] = score[i][0] + score[i][1];
        }

        for(int i=0; i<tot.length; i++){
            int rank = 1;
            for(int j=0; j<tot.length; j++){
                if(tot[i] < tot[j]) rank++;
                
            }
            answer[i] = rank;
        }
        return answer;
    }
}