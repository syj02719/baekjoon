import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        scanner.close();
        
        int sum = B + C;

        if (C/60 >= 1){
            if (A+(B+C)/60 >= 24){
                System.out.println(A+(B+C)/60-24 + " " + (B+C)%60);
            } else {
                System.out.println(A+(B+C)/60 + " " + (B+C)%60);
            }
        } else if (sum >= 60){
            if (A+(B+C)/60 >= 24){
                System.out.println(A+sum/60-24+ " " + sum%60);
            } else {
                System.out.println(A+sum/60 + " " + sum%60);
            }
        } else {
            if (A >= 24){
                System.out.println(A-24 + " " + sum);
            } else {
                System.out.println(A + " " + sum);
            }
        }

    }
}