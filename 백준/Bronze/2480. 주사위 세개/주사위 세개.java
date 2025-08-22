import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        int prize;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if(A==B && B==C) {
            prize = 10000 + A * 1000; 
        } else if (A==B && B!=C) {
            prize = 1000 + A * 100; 
        } else if (A!=B && B==C) {
            prize = 1000 + B * 100; 
        } else if (A==C && B!=C) {
            prize = 1000 + A * 100; 
        } else if( A > B && A > C) {
            prize = A *100;
        } else if(B>A && B>C) {
            prize = B * 100;
        } else {
            prize = C *100;
        }
        
        System.out.println(prize);
        sc.close();
    }
}