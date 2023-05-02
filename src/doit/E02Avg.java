package doit;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class E02Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double[] scores = new double[count];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        OptionalDouble maxdouble = Arrays.stream(scores).max();
        System.out.println("maxval = " + maxdouble);

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scores[i]/maxdouble.getAsDouble()*100;

        }

        OptionalDouble average = Arrays.stream(scores).average();
        System.out.println((int)average.getAsDouble());
    }
}
