import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double A = scanner.nextInt();
        double B = scanner.nextInt();
        
        if (B == 0) {
            System.out.println("0으로 나눌 수 없습니다.\n");
        } else {
                System.out.println(A/B);
            }
        
        scanner.close();
        
    }
}