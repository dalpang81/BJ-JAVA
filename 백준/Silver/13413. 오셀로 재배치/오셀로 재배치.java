import java.sql.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());

            String str1 = br.readLine();
            String str2 = br.readLine();

            int wbCnt = 0, bwCnt = 0;

            for(int j = 0; j < M; j++) {
                if(str1.charAt(j) == 'W' && str2.charAt(j) == 'B')
                    ++wbCnt;
                else if (str1.charAt(j) == 'B' && str2.charAt(j) == 'W')
                    ++bwCnt;
            }
            System.out.println(wbCnt < bwCnt ? bwCnt : wbCnt);
        }


    }
}