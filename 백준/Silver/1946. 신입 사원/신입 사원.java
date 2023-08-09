import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        while(T > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] score = new int[N + 1];
            for(int i = 0; i < N; i++) {
                String[] strArr = br.readLine().split(" ");
                int doc = Integer.parseInt(strArr[0]);
                int itv = Integer.parseInt(strArr[1]);
                score[doc] = itv;
            }

            int answer = 1;
            int standardItv = score[1];
            for(int j = 2; j <= N; j++) {
                if(score[j] < standardItv) {
                    answer++;
                    standardItv = score[j];
                }
            }
            T--;
            System.out.println(answer);
        }

    }
}