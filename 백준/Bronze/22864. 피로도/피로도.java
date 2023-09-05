import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int sleep = 0;
        int work = 0;

        if(A > M) {
            System.out.println(0);
            return;
        }

        for(int i = 0; i < 24; i++) {
            if(sleep + A <= M) {
                sleep += A;
                work += B;
            }

            else  {
                sleep -= C;

                if(sleep < 0)
                    sleep = 0;
            }
        }

        System.out.println(work);
    }
}