package doit;

import java.util.Scanner;

public class E05RemainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N];
        long[] C = new long[M];
        long answer = 0;
        S[0] = sc.nextInt();
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int remainder = (int) (S[i] % M);
            // 혼자서 나누어 떨어지는 경우를 더해준다.
            if(remainder==0) answer++;
            //나머지를 인덱스로 하여 그 개수를 더한다.
            C[remainder]++;
        }

        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                /*
                    combination(조합)의 공식 nCr
                    nCr = nPr / r! 인데
                    nPr = n! / (n-r)! 이므로
                    nCr = n! / r!(n-r)! 이 된다.
                    여기선 r이 2 이므로..(순서쌍)
                    n! / (n-2)! = n * (n-1)
                    그 후 순열이 아니라 조합이므로, r!(=2)로 나누어준다.
                 */
                answer = answer + (C[i] * (C[i] - 1) / 2);
            }
        }
        System.out.println("answer = " + answer);
    }
}
