import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String str = br.readLine();
            String[] arr = str.split(" ");


            for(int j = 0; j < arr.length; j++) {
                StringBuffer sb = new StringBuffer(arr[j]);
                String reverse = sb.reverse().toString();

                System.out.print(reverse + " ");
            }
            System.out.println();
        }
    }
}