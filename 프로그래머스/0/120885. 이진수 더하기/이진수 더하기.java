class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int dec1 = Integer.parseInt(bin1, 2);
        int dec2 = Integer.parseInt(bin2, 2);
        
        answer = Integer.toBinaryString(dec1+dec2);
        
        return answer;
    }
}