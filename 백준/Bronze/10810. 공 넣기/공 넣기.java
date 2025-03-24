import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int i = 0; int j = 0; int k = 0;
        int N = scanner.nextInt();
        int basket[] = new int[N];
        int M = scanner.nextInt();

        for (int l = 0; l < M; l++){
            i = scanner.nextInt();
            j = scanner.nextInt();
            k = scanner.nextInt();
            for (int w = i-1; w < j; w++){
                basket[w] = k;
            }
        }

        for (int l = 0; l < N; l++){
            System.out.print(basket[l] + " ");
        }
        scanner.close();
    
    }
}