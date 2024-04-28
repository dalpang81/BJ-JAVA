import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while(true)
        {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            int total = 1;

            if(n == -1)
                break;


            sb.append(n + " = 1");
            for(int i = 2; i < n; i++)
            {
                if(n % i == 0) {
                    sb.append(" + " + i);
                    total += i;
                }
            }

            if(total == n)
                System.out.println(sb);

            else
                System.out.println(n + " is NOT perfect.");
        }
    }
}