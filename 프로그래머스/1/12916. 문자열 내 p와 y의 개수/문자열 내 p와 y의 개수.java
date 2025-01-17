class Solution {
    boolean solution(String s) {
        boolean answer = true;
         int p = 0, y = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        
        for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);
            if( current == 'p' || current == 'P') {
                p++;
            }
            if( current == 'y' || current == 'Y') {
                y++;
            }
        }

        
        if(p != y) {answer=false;}

        return answer;
    }
}