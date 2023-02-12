package boj_2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int needTime = Integer.parseInt(br.readLine());

        int tempMinute = hour * 60 + minute;
        tempMinute += needTime;

        int finishHour = (tempMinute / 60);
        if (finishHour >= 24) finishHour = finishHour % 24;
        int finishMinute = tempMinute % 60;

        System.out.println(finishHour + " " + finishMinute);
    }
}
