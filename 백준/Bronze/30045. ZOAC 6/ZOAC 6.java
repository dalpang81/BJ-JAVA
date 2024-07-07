import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++) {
            String s = br.readLine();

            char[] c = new char[s.length()];
            for(int j = 0; j < s.length() - 1; j++) {
                if(s.charAt(j) == '0' && s.charAt(j + 1) == '1' || s.charAt(j) == 'O' && s.charAt(j + 1) == 'I') {
                    count++;
                    break;
                }
            }



        }

        System.out.println(count);
    }

}