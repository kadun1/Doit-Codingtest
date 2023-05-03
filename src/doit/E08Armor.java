package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class E08Armor {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 배열을 만들어준다.
        for (int i = 0; i < N; i++) {
             A[i] = Integer.parseInt(st.nextToken());
        }
        // 정렬
        Arrays.sort(A);

        int count = 0;
        int i = 0;
        int j = N - 1;

        // 투포인터 사용
        while (i < j) {
            if (A[i] + A[j] < M) {
                i++;
            } else if (A[i] + A[j] > M) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println("count = " + count);
        br.close();
    }
}
