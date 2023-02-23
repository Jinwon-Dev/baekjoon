package boj_11404;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static final int INF = 1000000000; // Integer.MAX_VALUE = X !!

    public static void main(final String... args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = INF;

                if (i == j) arr[i][j] = 0;
            }
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 시작 도시
            int b = Integer.parseInt(st.nextToken()); // 도착 도시
            int c = Integer.parseInt(st.nextToken()); // 비용

            arr[a][b] = Math.min(arr[a][b], c);
        }

        // 플로이드 알고리즘
        for (int k = 1; k <= n; k++) { // 경유지
            for (int i = 1; i <= n; i++) { // 출발지
                for (int j = 1; j <= n; j++) { // 도착지
                    if (arr[i][j] > arr[i][k] + arr[k][j]) arr[i][j] = arr[i][k] + arr[k][j];
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] == INF) arr[i][j] = 0;
                sb.append(arr[i][j] + " ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
