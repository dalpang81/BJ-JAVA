import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringTokenizer st0 = new StringTokenizer(S, "0");
        StringTokenizer st1 = new StringTokenizer(S, "1");
        System.out.println(Math.min(st0.countTokens(), st1.countTokens()));
    }
}