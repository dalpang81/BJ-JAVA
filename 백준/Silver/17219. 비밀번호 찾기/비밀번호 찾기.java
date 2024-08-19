import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> site = new HashMap<>();
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String sites = st.nextToken();
            String pw = st.nextToken();

            site.put(sites, pw);
        }

        for(int i = 0; i < M; i++) {
            String link = br.readLine();
                if(site.containsKey(link)) {
                    bw.write(site.get(link) + "\n");
                }
        }

        bw.flush();
        bw.close();
    }
}