package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static Stack<Integer> stack = new Stack<>();

    private static StringTokenizer st;

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            makeStack(st.nextToken());
        }

        System.out.println(sb);
    }

    private static void makeStack(String s) {

        if (s.equals("push")) {
            stack.push(Integer.parseInt(st.nextToken()));
        } else if (s.equals("pop")) {
            if (stack.empty()) sb.append("-1").append("\n");
            else sb.append(stack.pop()).append("\n");
        } else if (s.equals("size")) {
            sb.append(stack.size()).append("\n");
        } else if (s.equals("empty")) {
            if (stack.empty()) sb.append("1").append("\n");
            else sb.append("0").append("\n");
        } else if (s.equals("top")) {
            if (stack.empty()) sb.append("-1").append("\n");
            else sb.append(stack.peek()).append("\n");
        }
    }
}
