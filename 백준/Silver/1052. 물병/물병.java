import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int ans = 0;
        while(true) {
            int tmp = N + ans;
            int count = 0;

            while(tmp > 0) {
                if(tmp % 2 != 0)
                    count++;
                tmp /= 2;
            }
            if(count <= K)
                break;
            ans++;
        }
        System.out.println(ans);
    }
}