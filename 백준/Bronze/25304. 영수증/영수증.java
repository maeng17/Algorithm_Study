import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, N;
        int total = 0;
        X = sc.nextInt();
        N = sc.nextInt();

        for(int i=0; i<N; i++){
            int price, count;
            price = sc.nextInt();
            count = sc.nextInt();
            total += price * count;
        }
        if( X == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}