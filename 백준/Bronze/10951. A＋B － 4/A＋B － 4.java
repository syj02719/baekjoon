import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int A = 0;
        int B = 0;
        
        while(scanner.hasNext()){
            A = scanner.nextInt();
            B = scanner.nextInt();
            System.out.println(A + B);
        }
    }
}