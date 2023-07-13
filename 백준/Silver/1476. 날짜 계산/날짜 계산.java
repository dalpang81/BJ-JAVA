import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int E = s.nextInt();
        int S = s.nextInt();
        int M = s.nextInt();

        int E_temp = 1;
        int S_temp = 1;
        int M_temp = 1;

        int year = 1;

        while(true) {
            if(E == E_temp && S == S_temp && M == M_temp)
                break;

            E_temp++; S_temp++; M_temp++; year++;

            if(E_temp == 16) E_temp = 1;
            if(S_temp == 29) S_temp = 1;
            if(M_temp == 20) M_temp = 1;
        }

        System.out.print(year);

    }
}
