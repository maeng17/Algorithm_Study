import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        int answer;

        a = sc.nextInt();
        b = sc.nextInt();

        //b 문자 변환 후 배열에 잘라 넣기
        String stringB = String.valueOf(b);

        int[] list = new int[stringB.length()];

        for(int i=0; i<list.length; i++){
            char charB = stringB.charAt(i);

            list[i] = charB - '0';
        }

        for(int i=list.length-1; i>=0; i--){
            System.out.println(list[i]*a);
        }
        System.out.println(a*b);

    }
}