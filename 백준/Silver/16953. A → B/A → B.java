import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int ans = 1;

        while(B != A) {
            if(B < A) {
                System.out.println(-1);
                return;
            }

            String str = String.valueOf(B);
            if(B % 2 == 0) B /= 2;

            else if(str.charAt(str.length() - 1) == '1') {
                str = str.substring(0, str.length() - 1);
                B = Integer.parseInt(str);
         }
            else {
                System.out.println(-1);
                return;
            }
            ans++;
        }
        System.out.println(ans);
    }

}