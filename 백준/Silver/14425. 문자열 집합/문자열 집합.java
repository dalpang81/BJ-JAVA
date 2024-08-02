import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;

        String[] S = new String[N];
        String[] S2 = new String[M];

        for(int i = 0; i < N; i++)
            S[i] = br.readLine();
        for(int i = 0; i < M; i++)
            S2[i] = br.readLine();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(S[i].equals(S2[j]))
                    count++;
            }
        }

        System.out.println(count);




    }
}