package boj_10950;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }

        System.out.println(sb);
    }
}
