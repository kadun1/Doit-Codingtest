package doit;

import java.util.Scanner;

public class E03AreaSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int sum = 0;
            for (int j = first-1; j < second; j++) {
                sum += arr[j];
            }
            System.out.println("sum = " + sum);
        }

    }
}
