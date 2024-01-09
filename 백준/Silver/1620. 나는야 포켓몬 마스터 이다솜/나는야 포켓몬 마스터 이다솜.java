import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
        HashMap<String, Integer> hash2 = new HashMap<String, Integer>();

        for(int i = 1; i < N + 1; i++) {
            String s = br.readLine();
            hash1.put(i, s);
            hash2. put(s, i);
        }

        for(int i = 0; i < M; i++) {
            String s = br.readLine();
            if(49 <= s.charAt(0) && s.charAt(0) <= 57) {
                System.out.println(hash1.get(Integer.parseInt(s)));
            }
            else {
                System.out.println(hash2.get(s));
            }

        }
    }
}