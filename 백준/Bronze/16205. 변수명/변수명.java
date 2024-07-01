import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        String name = st.nextToken();

        char[] c = new char[name.length()];

        for(int i = 0; i < name.length(); i++) {
            c[i] = name.charAt(i);
        }


        if(N == 1)
            System.out.print(name);
        else {
            for(int i = 0; i < c.length; i++) {
                if(c[i] == '_') {
                    System.out.print(Character.toUpperCase(c[i + 1]));
                    i++;
                }
                else if(i == 0)
                    System.out.print(Character.toLowerCase(c[i]));
                else
                    System.out.print(c[i]);
            }
        }
        System.out.println();

        if(N == 2)
            System.out.print(name);
        else {
            for(int i = 0; i < c.length; i++) {
                if(i == 0)
                    System.out.print(Character.toLowerCase(c[i]));
                else if(Character.isUpperCase(c[i]))
                    System.out.print("_" + Character.toLowerCase(c[i]));
                else
                    System.out.print(c[i]);
            }
        }
        System.out.println();

        if(N == 3)
            System.out.print(name);
        else {
            for(int i = 0; i < c.length; i++) {
                if(i == 0)
                    System.out.print(Character.toUpperCase(c[i]));
                else if(c[i] == '_') {
                    System.out.print(Character.toUpperCase(c[i + 1]));
                    i++;
                }
                else
                    System.out.print(c[i]);
            }
        }




    }

}