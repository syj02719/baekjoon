import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int prize = 0;
        
        scanner.close();

        if (A == B && B == C){
            prize = 10000 + A * 1000;
        } else if (A == B || B == C){
            prize = 1000 + B * 100;
        } else if (C == A){
            prize = 1000 + A * 100;
        } else {
            if (A > B && B > C || A > B && A > C) {
                prize = A * 100;
            } else if (B > A && A > C || B > A & B > C){
                prize = B * 100;
            } else if (C > B && B > A || C > A & C > B){
                prize = C * 100;
            }
        }
        
        System.out.println(prize);
           
    }
}