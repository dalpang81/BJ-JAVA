import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(br.readLine());

        if(N % 2 == 0)
            System.out.println("SK");
        else
            System.out.println("CY");
    }


}