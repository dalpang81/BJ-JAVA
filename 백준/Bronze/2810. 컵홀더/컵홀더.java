import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        String arr = "";

        for(int i = 0 ; i < N; i++) {
            if(str.charAt(i) == 'S')
                arr += "*S";
            else {
                arr += "*LL";
                i++;
            }
        }
        arr += "*";
        int count = 0;
        for(int i = 0; i < arr.length(); i++)
        {
            if(arr.charAt(i) == '*') count++;
        }
        count = Math.min(count, N);
        System.out.println(count);
    }

}