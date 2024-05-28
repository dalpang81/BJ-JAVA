import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] suyeol = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] arr = new int[N];
        int tmptmp = 0;



        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {

            int tmp1 = 0;
            int tmp2 = 0;

            for(int j = 0; j < 10; j++) {
                if(arr[i] < jegob(j)) {
                    arr[i] = arr[i] - jegob(j - 1);
                    if(tmp1 == 0) {
                        tmp1 = j - 1;
                        //System.out.print(tmp1 + " ");
                        break;
                    }
                }
            }

            for(int h = 0; h < 10; h++) {
                if(arr[i] < jegob(h)) {
                    arr[i] = arr[i] - jegob(h - 1);
                    if(tmp2 == 0) {
                        tmp2 = h - 1;

                        //System.out.println(tmp2);
                        //System.out.println("===============");
                        break;
                    }
                }
            }



            for(int k = 0; k < 8; k++) {
                for(int y = 0; y < 8; y++) {
                    if(arr[i] != 0)
                        break;
                    if(tmptmp == 0) {
                        if(suyeol[k] == tmp1 && suyeol[y] == tmp2) {
                            int tmp = 0;

                            tmp = suyeol[k];
                            suyeol[k] = suyeol[y];
                            suyeol[y] = tmp;
                            tmptmp++;

                            //System.out.println("**" + suyeol[k] + " " + tmp1);
                        }
                    }
                }
            }
            tmptmp = 0;

        }

        for(int i = 0; i < 8; i++) {
            if(K == suyeol[i])
                System.out.println(i);
        }
    }

    static int jegob(int n) {
        int _jegobs = 1;
        for(int i = 0; i < n; i++)
            _jegobs = (_jegobs * 2);

        if(n == 0)
            return 1;
        else if(n == 1)
            return 2;
        else
            return _jegobs;


    }
}