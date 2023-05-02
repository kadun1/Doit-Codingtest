package doit;

import java.util.Scanner;

public class E06ContinueSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        int count = 1;
        int start_index = 1;
        int end_index = 1;

        while (end_index != n) {
            if (sum == n) {
                end_index++;
                sum += end_index;
                count++;
            } else if(sum > n){
                sum -= start_index;
                start_index++;
            } else if(sum < n){
                sum += end_index;
                end_index++;
            }
        }
        System.out.println("count = " + count);

    }
}
