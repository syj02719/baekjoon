import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        
        scanner.close();
        
        if (M >= 45){
            System.out.println(H + " " + (M-45));
        } else if (H == 0 && M < 45){
                System.out.print("23 ");
                System.out.println(60-(45-M));
        } else {
                System.out.print(H-1 + " ");
                System.out.println(60-(45-M));
        }
    }
}