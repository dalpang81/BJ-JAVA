import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        int A = 0;
        int B = 0;
        int C = 0;

        A = T / 300;
        T = T % 300;


        B = T / 60;
        T = T % 60;

        C = T / 10;
        T = T % 10;

        if(T != 0) {
            System.out.println(-1);
        }

        else
        {
            System.out.print(A + " " + B + " " + C);
        }


    }
}