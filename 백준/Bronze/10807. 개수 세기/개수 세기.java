import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int num[] = new int[N];
        int count = 0;
        
        for (int i = 0; i < N; i++){
            num[i] = scanner.nextInt();
        }
        

        int v = scanner.nextInt();
        for (int i = 0; i < N; i++){
            if (num[i] == v){
                count++;
            }
        }
        
        System.out.println(count);
        
        scanner.close();
    
    }
}