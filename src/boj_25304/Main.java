package boj_25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalPrice = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int currentPrice = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            currentPrice += price * count;
        }

        if (currentPrice == totalPrice) System.out.println("Yes");
        else System.out.println("No");
    }
}
