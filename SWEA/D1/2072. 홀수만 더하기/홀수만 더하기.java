import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int sum[] = new int[T];

        for (int test_case = 1; test_case <= T; test_case++) {
            for (int j = 0; j < 10; j++) {
                int num = sc.nextInt();
                if (num % 2 != 0) {
                    sum[test_case-1] += num;
                }
            }
        }
        for (int test_case = 1; test_case <= T; test_case++) {
            System.out.println("#" + test_case + " " + sum[test_case-1]);
        }
    }
}