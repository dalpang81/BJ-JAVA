import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //SStringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int K = Integer.parseInt(br.readLine());

        for(int j = 0; j < K; j++) {
            for(int i = 0; i < K; i++)
                System.out.print("G");
            for(int i = 0; i < K * 4 - K; i++)
                System.out.print(".");
            System.out.println();
        }



        for(int j = 0; j < K; j++) {
            for(int i = 0; i < K; i++)
                System.out.print(".");
            for(int i = 0; i < K; i++)
                System.out.print("I");
            for(int i = 0; i < K; i++)
                System.out.print(".");
            for(int i = 0; i < K; i++)
                System.out.print("T");

            System.out.println();
        }

        for(int j = 0; j < K; j++) {
            for(int i = 0; i < K * 2; i++)
                System.out.print(".");
            for(int i = 0; i < K; i++)
                System.out.print("S");
            for(int i = 0; i < K; i++)
                System.out.print(".");
            System.out.println();
        }


    }
}