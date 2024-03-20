class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = new String[my_string.length()];
        int c = 0;
        
        for(int i=0; i<my_string.length(); i++){
            if(Character.isUpperCase(my_string.charAt(i))) {
                arr[c] = String.valueOf(Character.toLowerCase(my_string.charAt(i)));
                c++;
            }
            else {
                arr[c] = String.valueOf(Character.toUpperCase(my_string.charAt(i)));
                c++;
            } 
        }
        
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}