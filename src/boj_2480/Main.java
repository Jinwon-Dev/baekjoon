package boj_2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a != b && b != c && a != c) { // 세 수가 모두 다른 경우
            int max = a;
            if (max < b) max = b;
            if (max < c) max = c;

            System.out.println(max * 100);
        } else { // 적어도 한 쌍 이상의 같은 수가 존재할 경우
            if (a == b && a == c) System.out.println(10000 + (a * 1000));
            else if (a == b || a == c) System.out.println(1000 + (a * 100));
            else System.out.println(1000 + (b * 100));
        }
    }
}
