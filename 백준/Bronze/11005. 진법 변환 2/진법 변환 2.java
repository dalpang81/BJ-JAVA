import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int tmp = 0;
        String result = "";

        while(N > 0)
        {
            tmp = N % B;
            if (tmp >= 10)
            {
                char c = (char)(tmp + 55);
                result += c;
            }
            else {
                result += tmp;
            }
            N = N / B;
        }
        for(int i = result.length() - 1; i >= 0; i--)
        {
            System.out.print(result.charAt(i));
        }



    }
}