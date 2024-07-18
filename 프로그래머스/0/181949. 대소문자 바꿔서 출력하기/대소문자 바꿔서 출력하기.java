import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String s = "";
        for(int i=0; i<a.length(); i++){
            char check = a.charAt(i);
            if(Character.isUpperCase(check)){
                s += Character.toLowerCase(check);
            } else {
                s += Character.toUpperCase(check);
            }
        }
        System.out.println(s);
    }
}