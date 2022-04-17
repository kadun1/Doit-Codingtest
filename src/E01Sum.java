import java.util.Scanner;

public class E01Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += sc.nextInt();
        }
        System.out.println("sum = " + sum);

    }
}
