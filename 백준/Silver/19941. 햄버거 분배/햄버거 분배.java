import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        char[] list = new char[N];
        boolean[] ate = new boolean[N];

        for(int i = 0; i < N; i++) {
            list[i] = str.charAt(i);
        }

        int answer = 0;
        for(int i = 0; i < N; i++) {
            if(list[i] == 'P') {
                int startIndex = Math.max(i-K, 0);
                int endIndex = Math.min(i+K, N-1);
                for(int j = startIndex; j <= endIndex; j++) {
                    if(list[j] == 'H' && !ate[j]) {
                        ate[j] = true;
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}