import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        String[] name = new String[N];
        String[] ring = new String[N];

        int[] num = new int[N];

        int tmp = 0;
        int index = 0;
        String tmpString = null;

        for(int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            name[i] = st.nextToken();
            ring[i] = st.nextToken();
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!(ring[i].equals("-") || ring[j].equals("-"))) {
                    if(!(i == j)) {
                        if(ring[i].equals(ring[j]))
                            tmp++;
                    }
                }

            }
            if(tmp == 1)
                index++;
            tmp = 0;
        }
        if( index == 0 )
            System.out.println(0);
        else
            System.out.println(index / 2);

        //======================================

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!(i == j)) {
                    if(!(ring[i].equals("-") || ring[j].equals("-"))) {
                        if(ring[i].equals(ring[j])) {
                            tmp++;
                            tmpString = name[j];
                            num[i]++;
                            num[j]++;
                        }
                    }

                }
            }
            if(tmp == 1) {
                if(num[i] < 2)
                    System.out.println(name[i] + " " + tmpString);

            }
            tmp = 0;
        }





    }
}