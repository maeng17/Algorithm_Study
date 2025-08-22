import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        int totalTime = A * 60 + B + C;

        int H = totalTime / 60;
        int M = totalTime % 60;

        if(H >=24 ){
            H %= 24;
        }


        System.out.println(H + " " + M);
        sc.close();
    }
}