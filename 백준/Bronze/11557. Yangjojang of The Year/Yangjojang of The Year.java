import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int j = 0; j < T; j++) {
            int N = Integer.parseInt(br.readLine());

            String[] S = new String[N];
            int[] L = new int[N];

            int max = 0;
            int index = 0;

            for(int i = 0; i < N; i++)
            {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                S[i] = st.nextToken();
                L[i] = Integer.parseInt(st.nextToken());

                if(L[i] > max) {
                    max = L[i];
                    index = i;
                }
            }

            System.out.println(S[index]);
        }





    }

}