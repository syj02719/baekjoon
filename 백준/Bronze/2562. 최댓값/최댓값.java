import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int num[] = new int[9];

        for (int i = 0; i < 9; i++){
            num[i] = scanner.nextInt();
        }

        int max = num[0];
        int j = 1;
        
        for (int i = 0; i < 9; i++){
            if (num[i] > max){
                max = num[i];
                j = i+1;
            }
        }
        
        System.out.println(max);
        System.out.println(j);
        
        scanner.close();
    
    }
}