class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] arr = new char[my_string.length()];
        int c = 0;
        
        for(int i=0; i<my_string.length(); i++){
            arr[c] = my_string.charAt(i);
            c++;
        }
        
        char s = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = s;
        
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}